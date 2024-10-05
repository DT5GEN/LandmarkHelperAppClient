package com.dt5gen.landmarkhelperat2.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.dt5gen.landmarkhelperat2.viewmodel.LandmarkViewModel


@Composable
fun LandmarkListScreen(viewModel: LandmarkViewModel) {
    val landmarks by viewModel.landmarks.collectAsState()
    val isLoading by viewModel.isLoading.collectAsState()
    var selectedFilter by remember { mutableStateOf("По алфавиту") }

    Column {
        FilterSection(onFilterChanged = { newFilter ->
            selectedFilter = newFilter
            // Здесь можно реализовать логику фильтрации через ViewModel
            viewModel.filterLandmarks(newFilter)
        })

        if (isLoading) {
            CircularProgressIndicator()
        } else {
            LazyColumn {
                items(landmarks) { landmark ->
                    Text(text = landmark.name)
                }
            }
        }
    }
}

@Composable
fun FilterSection(onFilterChanged: (String) -> Unit) {
    var selectedFilter by remember { mutableStateOf("По алфавиту") }
    var expanded by remember { mutableStateOf(true) }

    DropdownMenu(
        expanded = expanded,
        onDismissRequest = { expanded = false }
    ) {
        DropdownMenuItem(onClick = {
            selectedFilter = "По алфавиту"
            onFilterChanged(selectedFilter)
            expanded = false
        }) {
            Text(text = "По алфавиту")
        }

        DropdownMenuItem(onClick = {
            selectedFilter = "По рейтингу"
            onFilterChanged(selectedFilter)
            expanded = false
        }) {
            Text(text = "По рейтингу")
        }
    }
}




