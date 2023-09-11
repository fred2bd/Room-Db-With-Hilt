package com.example.roomdbwithhilt.db.dao

import androidx.room.*
import com.example.roomdbwithhilt.model.entity.User
import dagger.Provides

@Dao
interface UserDao {
    @Query("SELECT * FROM users")
   suspend fun getAllUsers(): List<User>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: User)

    @Delete
    suspend fun deleteUser(user: User)
}