package com.example.testproject

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.testproject.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var isAllfabschecked = false
        binding.extendFabShow.shrink()

        binding.extendFabShow.setOnClickListener {

            isAllfabschecked = if (isAllfabschecked) {
                binding.extendFabShow.extend()
                hide()
                false
            } else {
                binding.extendFabShow.shrink()
                show()
                true
            }
        }

    }

    private fun show() {
        binding.fabEdit.show()
        binding.fabDelete.show()
        binding.fabShare.show()
        binding.extendFabShow.extend()

    }

    private fun hide() {
        binding.fabEdit.hide()
        binding.fabDelete.hide()
        binding.fabShare.hide()
        binding.extendFabShow.shrink()
    }
    fun onClick(view : View) {

        when (view.id) {

            R.id.fab_edit -> toast("ویرایش کردن")
            R.id.fab_delete -> toast("پاک کردن")
            R.id.fab_share -> toast("استراک گذاری")
        }
    }
    private fun toast(text: String){
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}






