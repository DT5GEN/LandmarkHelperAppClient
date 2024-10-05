package com.dt5gen.landmarkhelperat2.ui

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dt5gen.landmarkhelperat2.ui.screens.LandmarkListScreen
import com.dt5gen.landmarkhelperat2.ui.screens.LandmarksScreen
import com.dt5gen.landmarkhelperat2.ui.screens.LocalitiesScreen
import com.dt5gen.landmarkhelperat2.ui.screens.ServicesScreen
import com.dt5gen.landmarkhelperat2.viewmodel.LandmarkViewModel

@Composable
fun MainScreen(viewModel: LandmarkViewModel) {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) {
        NavHost(navController = navController, startDestination = "services") {
            composable(route = "services") { ServicesScreen() }
            composable(route = "landmarks") { LandmarksScreen() }
            composable(route = "localities") { LocalitiesScreen() }
        }
    }
}


