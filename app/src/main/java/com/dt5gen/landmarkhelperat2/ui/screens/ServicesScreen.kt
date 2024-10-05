package com.dt5gen.landmarkhelperat2.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ServicesScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Services Screen", style = MaterialTheme.typography.headlineMedium)
        Button(onClick = { /* Действие */ }) {
            Text(text = "Service 1")
        }
        Button(onClick = { /* Действие */ }) {
            Text(text = "Service 2")
        }
    }
}