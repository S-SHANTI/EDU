package com.example.testproject

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testproject.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var mediaplayer : MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabStarMusic.setOnClickListener { onStartMusic() }
        binding.fabStarMusic.setOnClickListener { onpPuseMusic() }
        binding.fabStarMusic.setOnClickListener { onEndtMusic() }
    }

    private fun onStartMusic() {
       if (mediaplayer == null)
           mediaplayer = MediaPlayer.create(this,R.raw.music)
    }

    private fun onpPuseMusic() {
    mediaplayer?.pause()
    }

    private fun onEndtMusic() {
        mediaplayer?.stop()
        mediaplayer?.release()
        mediaplayer = null
    }
}






