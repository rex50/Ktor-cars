package com.rex50.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Car(
     val name: String,
     val imageUrl: String,
     val doors: Int,
     val type: String
)
