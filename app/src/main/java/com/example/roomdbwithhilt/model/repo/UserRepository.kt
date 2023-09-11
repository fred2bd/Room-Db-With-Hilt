package com.example.roomdbwithhilt.model.repo

import com.example.roomdbwithhilt.db.dao.UserDao
import com.example.roomdbwithhilt.model.entity.User
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(
    private val userDao: UserDao
) {


   suspend fun getAllUsers(): List<User> {
        return userDao.getAllUsers()
    }

    suspend fun insertUser(user: User) {
        userDao.insertUser(user)
    }

    suspend fun deleteUser(user: User) {
        userDao.deleteUser(user)
    }
}