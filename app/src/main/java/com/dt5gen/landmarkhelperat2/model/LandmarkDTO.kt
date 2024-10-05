package com.dt5gen.landmarkhelperat2.model

data class LandmarkDTO(
    val id: Long,
    val name: String,
    val description: String,
    val creationDate: String,
    val type: String?,
    val locality: LocalityDTO?,
    val parentLandmark: LandmarkDTO?
)