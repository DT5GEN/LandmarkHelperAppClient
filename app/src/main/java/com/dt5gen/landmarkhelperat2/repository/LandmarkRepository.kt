package com.dt5gen.landmarkhelperat2.repository


import android.app.Application
import androidx.room.Room
import com.dt5gen.landmarkhelperat2.model.toEntity
import com.dt5gen.landmarkhelperat2.network.RetrofitInstance.api
import com.dt5gen.landmarkhelperat2.room.LandmarkDao
import com.dt5gen.landmarkhelperat2.room.LandmarkDatabase
import com.dt5gen.landmarkhelperat2.room.LandmarkEntity

class LandmarkRepository(application: Application) {
    private val landmarkDao: LandmarkDao

    init {
        val db = Room.databaseBuilder(
            application,
            LandmarkDatabase::class.java, "landmark-database"
        ).build()

        landmarkDao = db.landmarkDao()
    }

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
