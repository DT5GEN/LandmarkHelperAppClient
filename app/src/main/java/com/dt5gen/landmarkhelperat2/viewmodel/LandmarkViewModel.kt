package com.dt5gen.landmarkhelperat2.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dt5gen.landmarkhelperat2.model.LandmarkDTO
import com.dt5gen.landmarkhelperat2.repository.LandmarkRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class LandmarkViewModel : ViewModel() {

    private val repository = LandmarkRepository()

    private val _landmarks = MutableStateFlow<List<LandmarkDTO>>(emptyList())
    val landmarks: StateFlow<List<LandmarkDTO>> = _landmarks

    init {
        fetchLandmarks()
    }

    private fun fetchLandmarks() {
        viewModelScope.launch {
            val response = repository.getLandmarks()
            if (response.isSuccessful) {
                response.body()?.let {
                    _landmarks.value = it
                }
            }
        }
    }
}
