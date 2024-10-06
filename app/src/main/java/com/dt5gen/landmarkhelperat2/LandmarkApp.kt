package com.dt5gen.landmarkhelperat2

import android.app.Application
import androidx.room.Room
import com.dt5gen.landmarkhelperat2.room.LandmarkDatabase

class LandmarkApp : Application() {

    lateinit var database: LandmarkDatabase

    override fun onCreate() {
        super.onCreate()

        // Инициализация базы данных Room
        database = Room.databaseBuilder(
            applicationContext,
            LandmarkDatabase::class.java,
            "landmark-database"
        ).build()
    }
}
