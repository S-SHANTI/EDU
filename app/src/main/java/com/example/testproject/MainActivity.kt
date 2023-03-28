package com.example.testproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testproject.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//برای تغییر اسمم پروزه در خروجی از خط کد زیر استفاده می‌شود، همچنین در قسمت manifest ‌نیز می‌توان انجام داد
        title="TEST"

        binding.button.setOnClickListener {
            binding.textView.text = "TEST"
        }
    }


}






