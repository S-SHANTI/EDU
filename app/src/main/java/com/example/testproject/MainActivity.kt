package com.example.testproject

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.testproject.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val shared = getSharedPreferences("test", MODE_PRIVATE )

        binding.ratingBar.rating = shared.getFloat("rate",3f)

        binding.ratingBar.setOnRatingBarChangeListener { _, rating, _  ->

            val edit = shared.edit()
            edit.putFloat("rate", rating)
            edit.apply()
            Toast.makeText(this,rating.toString(),Toast.LENGTH_SHORT).show()

        }
    }

}