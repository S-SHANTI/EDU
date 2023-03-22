package com.example.testproject

import android.media.AudioManager
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.testproject.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val audiomanager = getSystemService(AUDIO_SERVICE) as AudioManager

        binding.seekBar.max = audiomanager.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
        binding.seekBar.progress = audiomanager.getStreamVolume(AudioManager.STREAM_MUSIC)

        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seekBar: SeekBar?,
                progress: Int,
                fromUser: Boolean
            ) {
                audiomanager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(
                    this@MainActivity,
                    seekBar?.progress.toString(),
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(
                    this@MainActivity,
                    seekBar?.progress.toString(),
                    Toast.LENGTH_SHORT
                ).show()
            }

        })
    }

}