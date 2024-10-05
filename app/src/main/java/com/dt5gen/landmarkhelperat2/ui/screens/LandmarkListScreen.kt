package com.dt5gen.landmarkhelperat2.ui.screens


import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dt5gen.landmarkhelperat2.model.LandmarkDTO
import com.dt5gen.landmarkhelperat2.viewmodel.LandmarkViewModel

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun LandmarkListScreen(viewModel: LandmarkViewModel) {
    val landmarks = viewModel.landmarks.value

    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        items(landmarks) { landmark ->
            LandmarkItem(landmark)
        }
    }
}

@Composable
fun LandmarkItem(landmark: LandmarkDTO) {
    Column(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
        Text(text = landmark.name, modifier = Modifier.padding(bottom = 4.dp))
        Text(text = landmark.description)
    }
}

@Preview
@Composable
fun PreviewLandmarkItem() {
    LandmarkItem(landmark = LandmarkDTO(1, "Eiffel Tower", "Famous tower in Paris", "1889-03-31", null, null, null))
}
