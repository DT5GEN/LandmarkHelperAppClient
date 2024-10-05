package com.dt5gen.landmarkhelperat2.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.dt5gen.landmarkhelperat2.room.LandmarkEntity

@Dao
interface LandmarkDao {
    @Query("SELECT * FROM 'LandmarkEntity")
    suspend fun getAllLandmarks(): List<LandmarkEntity>

    @Insert
    suspend fun insertAll(landmarks: List<LandmarkEntity>)
}