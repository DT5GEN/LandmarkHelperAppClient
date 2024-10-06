package com.dt5gen.landmarkhelperat2.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class LandmarkViewModelFactory(private val application: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LandmarkViewModel::class.java)) {
            return LandmarkViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
