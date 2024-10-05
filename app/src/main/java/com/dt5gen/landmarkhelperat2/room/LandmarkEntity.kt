package com.dt5gen.landmarkhelperat2.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "landmarks")
data class LandmarkEntity(
    @PrimaryKey val id: Long,
    val name: String,
    val description: String,
    val rating: Any
)