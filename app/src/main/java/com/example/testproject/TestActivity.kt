package com.example.testproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.testproject.databinding.ActivityTestBinding
import kotlin.math.log

class TestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name1")
        val id = intent.getIntExtra("id",0)
        val sleep=intent.getBooleanExtra("sleep",false)

        binding.button2.setOnClickListener {
            Toast.makeText(this,"salam"  , Toast.LENGTH_SHORT).show()
            binding.button2.setOnLongClickListener{
              Log.i("LONG_CLICK0","check")
                return@setOnLongClickListener true
            }

        }
    }
}