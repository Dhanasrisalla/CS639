package com.krushal.jdkshoppers.ui.screens.login

import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val preferences: SharedPreferences) : ViewModel() {

    fun login(username: String, password: String): Boolean {
        return username.isNotBlank() && password.isNotBlank() && username == "jdk" && password == "jdk@123"
    }
}

