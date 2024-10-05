package com.dt5gen.landmarkhelperat2.model

import com.dt5gen.landmarkhelperat2.room.LandmarkEntity

data class LandmarkDTO(
    val id: Long,
    val name: String,
    val description: String,
    val creationDate: String,
    val type: String?,
    val locality: LocalityDTO?,
    val parentLandmark: LandmarkDTO?
) {
    val rating: Int = 5
}

fun LandmarkDTO.toEntity(): LandmarkEntity {
    return LandmarkEntity(
        id = this.id,
        name = this.name,
        description = this.description,
        rating = this.rating
        // Добавь все необходимые поля
    )
}
