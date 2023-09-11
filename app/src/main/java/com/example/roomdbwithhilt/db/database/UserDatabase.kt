package com.example.roomdbwithhilt.db.database

import android.app.Application
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.roomdbwithhilt.db.dao.UserDao
import com.example.roomdbwithhilt.model.entity.User
import dagger.Provides
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Singleton

@Database(entities = [User::class], version = 1,  exportSchema = false)
abstract class UserDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao
}
