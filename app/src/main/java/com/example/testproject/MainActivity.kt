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

        binding.swBtn.setOnClickListener {
            if (binding.swBtn.isChecked)
                Toast.makeText(this, "on", Toast.LENGTH_SHORT).show()
                else
                Toast.makeText(this, "off", Toast.LENGTH_SHORT).show()
            }
        }
    }