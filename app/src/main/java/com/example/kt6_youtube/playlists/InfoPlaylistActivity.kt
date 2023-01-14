package com.example.kt6_youtube.playlists

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kt6_youtube.databinding.ActivityInfoPlaylistBinding

class InfoPlaylistActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInfoPlaylistBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoPlaylistBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val id = intent.getSerializableExtra(PlaylistActivity.KEY_FOR_ID) as String
        Toast.makeText(this , id , Toast.LENGTH_SHORT).show()
    }
}