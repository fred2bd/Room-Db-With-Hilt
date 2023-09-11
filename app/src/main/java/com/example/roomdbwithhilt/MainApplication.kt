package com.example.roomdbwithhilt

import android.app.Application
import com.example.roomdbwithhilt.db.database.UserDatabase
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MainApplication :Application() {
    override fun onCreate() {
        super.onCreate()


    }
}