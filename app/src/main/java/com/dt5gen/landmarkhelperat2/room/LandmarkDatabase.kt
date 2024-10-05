
package com.dt5gen.landmarkhelperat2.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [LandmarkEntity::class], version = 1)
abstract class LandmarkDatabase : RoomDatabase() {
    abstract fun landmarkDao(): LandmarkDao
}