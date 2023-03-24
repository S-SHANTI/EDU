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

    }

    override fun onStart() {
        super.onStart()
        toast("onStart")
    }

    override fun onResume() {
        super.onResume()
        toast("onResume")
    }

    private fun toast(text : String){
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
    }
}






