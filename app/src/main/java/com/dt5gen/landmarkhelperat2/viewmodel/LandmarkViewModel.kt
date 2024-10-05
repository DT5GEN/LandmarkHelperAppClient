package com.dt5gen.landmarkhelperat2.viewmodel

import androidx.lifecycle.ViewModel
import com.dt5gen.landmarkhelperat2.network.RetrofitInstance
import com.dt5gen.landmarkhelperat2.repository.LandmarkRepository
import com.dt5gen.landmarkhelperat2.room.LandmarkDatabase

class LandmarkViewModel : ViewModel() {
    private val repository: LandmarkRepository = LandmarkRepository(
        RetrofitInstance.api,
        landmarkDao = LandmarkDatabase.getInstance(context).landmarkDao()
    )
}