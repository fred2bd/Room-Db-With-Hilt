package com.example.roomdbwithhilt.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.roomdbwithhilt.R
import com.example.roomdbwithhilt.model.entity.User
import com.example.roomdbwithhilt.viewmodel.UserViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val userViewModel: UserViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User(1, "Alice", "alice@example.com")
        userViewModel.insertUser(user)

        lifecycleScope.launch {

            val result = userViewModel.getAllUsers()
            Log.d("MainActivity", result[0].name)

        }


    }
}