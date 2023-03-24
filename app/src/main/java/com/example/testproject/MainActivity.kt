package com.example.testproject

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.testproject.databinding.ActivityMainBinding


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var onDoubleClick = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }


    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (onDoubleClick) {
            super.onBackPressed()
            return
        }
        onDoubleClick = true
        toast("لطفن دوباره کلیک کنید")
        Handler(Looper.getMainLooper()).postDelayed({onDoubleClick=false},3000)
    }
    private fun toast(text : String){
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
    }
}






