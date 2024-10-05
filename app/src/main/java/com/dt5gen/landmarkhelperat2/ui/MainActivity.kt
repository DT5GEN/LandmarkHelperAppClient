package com.dt5gen.landmarkhelperat2.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.dt5gen.landmarkhelperat2.viewmodel.LandmarkViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = LandmarkViewModel()

        setContent {
            MainScreen(viewModel = viewModel)
        }
    }
}
