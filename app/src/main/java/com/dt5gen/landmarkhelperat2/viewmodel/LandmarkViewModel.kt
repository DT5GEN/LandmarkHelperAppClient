package com.dt5gen.landmarkhelperat2.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.android.gms.vision.face.Landmark
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class LandmarkViewModel : ViewModel() {
    private val _landmarks = MutableStateFlow<List<Landmark>>(emptyList())
    val landmarks: StateFlow<List<Landmark>> = _landmarks

    // Логика загрузки данных и работы с фильтрацией
    fun loadLandmarks() {
        viewModelScope.launch {
            // Загрузка данных
            _landmarks.value = fetchLandmarksFromRepository()
        }
    }
}