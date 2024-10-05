package com.dt5gen.landmarkhelperat2.network

import com.dt5gen.landmarkhelperat2.model.LandmarkDTO
import retrofit2.Response
import retrofit2.http.GET

interface LandmarkApi {
    @GET("landmark")
    suspend fun getLandmarks(): Response<List<LandmarkDTO>>
}