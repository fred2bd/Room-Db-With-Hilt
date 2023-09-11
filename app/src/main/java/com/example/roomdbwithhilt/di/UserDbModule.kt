package com.example.roomdbwithhilt.di

import android.content.Context
import androidx.room.Room

import com.example.roomdbwithhilt.db.dao.UserDao
import com.example.roomdbwithhilt.db.database.UserDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object UserDbModule  {


    @Singleton
    @Provides
    fun providesUserDatabase(@ApplicationContext context: Context)
            = Room.databaseBuilder(context,UserDatabase::class.java,"UserDatabase").fallbackToDestructiveMigration().build()


    @Provides
    fun providesUserDao(userDatabase: UserDatabase): UserDao = userDatabase.userDao()


}