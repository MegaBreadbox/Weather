package com.example.weather.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Weather(
    val latitude: String,
    val longitude: String,
    val timezone: String,
    @SerialName(value = "current_weather")
    val currentWeather: String
)