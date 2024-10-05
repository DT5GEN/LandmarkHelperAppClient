package com.dt5gen.landmarkhelperat2.repository


import com.dt5gen.landmarkhelperat2.model.LandmarkDTO
import com.dt5gen.landmarkhelperat2.network.RetrofitInstance
import retrofit2.Response

class LandmarkRepository {
    suspend fun getLandmarks(): Response<List<LandmarkDTO>> {
        return RetrofitInstance.api.getLandmarks()
    }
}