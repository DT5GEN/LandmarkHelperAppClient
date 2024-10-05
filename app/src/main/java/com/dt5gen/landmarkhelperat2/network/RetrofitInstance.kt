package com.dt5gen.landmarkhelperat2.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("http://192.168.0.243:8080/api/landmark/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: LandmarkApi by lazy {
        retrofit.create(LandmarkApi::class.java)
    }
}