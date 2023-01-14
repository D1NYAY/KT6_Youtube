package com.example.kt6_youtube

import android.app.Application
import com.example.kt6_youtube.repository.Repository

class App : Application() {

    val repository : Repository by lazy {
        Repository()
    }
}