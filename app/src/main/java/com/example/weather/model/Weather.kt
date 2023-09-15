package com.example.weather.model

import kotlinx.serialization.Serializable

@Serializable
data class Weather(
    val latitude: String,
    val longitude: String,
    val timeZone: String,
    val temperature: String
)