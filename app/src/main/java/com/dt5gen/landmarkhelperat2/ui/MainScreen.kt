package com.dt5gen.landmarkhelperat2.ui

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dt5gen.landmarkhelperat2.ui.screens.LandmarksScreen
import com.dt5gen.landmarkhelperat2.ui.screens.LocalitiesScreen
import com.dt5gen.landmarkhelperat2.ui.screens.ServicesScreen


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) {
        // Контент для каждого экрана в зависимости от текущей вкладки
        NavHost(navController = navController, startDestination = "services") {
            composable("services") { ServicesScreen() }
            composable("landmarks") { LandmarksScreen() }
            composable("localities") { LocalitiesScreen() }
        }
    }
}