package com.example.roomdbwithhilt.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.roomdbwithhilt.model.entity.User
import com.example.roomdbwithhilt.model.repo.UserRepository
import dagger.Provides
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    suspend fun getAllUsers(): List<User> {
        return userRepository.getAllUsers()
    }

    fun insertUser(user: User) {

        viewModelScope.launch { userRepository.insertUser(user) }

    }

    suspend fun deleteUser(user: User) {

        viewModelScope.launch {
            userRepository.deleteUser(user)
        }


    }
}