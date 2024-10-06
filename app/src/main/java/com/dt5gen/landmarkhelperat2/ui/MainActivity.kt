package com.dt5gen.landmarkhelperat2.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.dt5gen.landmarkhelperat2.viewmodel.LandmarkViewModel
import com.dt5gen.landmarkhelperat2.viewmodel.LandmarkViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel: LandmarkViewModel by viewModels {
            LandmarkViewModelFactory(application)
        }

        setContent {
            MainScreen(viewModel = viewModel)
        }
    }
}