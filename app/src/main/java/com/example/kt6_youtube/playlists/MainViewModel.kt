package com.example.kt6_youtube.playlists

import androidx.lifecycle.LiveData
import com.example.kt6_youtube.App
import com.example.kt6_youtube.core.ui.BaseViewModel
import com.example.kt6_youtube.data.model.Playlists

class MainViewModel : BaseViewModel() {


    fun playlist() : LiveData<Playlists> {
        return App().repository.getPlaylists()
    }



}