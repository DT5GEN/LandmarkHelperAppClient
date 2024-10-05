package com.dt5gen.landmarkhelperat2.repository


import androidx.room.Room
import com.dt5gen.landmarkhelperat2.model.toEntity
import com.dt5gen.landmarkhelperat2.network.LandmarkApi
import com.dt5gen.landmarkhelperat2.room.LandmarkDao
import com.dt5gen.landmarkhelperat2.room.LandmarkDatabase
import com.dt5gen.landmarkhelperat2.room.LandmarkEntity



class LandmarkRepository(
    private val api: LandmarkApi,
    val landmarkDao: LandmarkDao = Room.databaseBuilder(
        context.applicationContext,
        LandmarkDatabase::class.java,
        "landmark-database"
    ).build().landmarkDao()
) {
    suspend fun getLandmarks(): List<LandmarkEntity> {
        val localData = landmarkDao.getAllLandmarks()
        if (localData.isNotEmpty()) {
            return localData
        } else {
            val response = api.getLandmarks()
            if (response.isSuccessful) {
                val landmarks = response.body()!!
                landmarkDao.insertAll(landmarks.map { it.toEntity() })
                return landmarks.map { it.toEntity() }
            }
        }
        return emptyList()
    }
}