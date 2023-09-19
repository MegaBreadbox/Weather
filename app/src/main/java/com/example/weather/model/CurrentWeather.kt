package com.example.weather.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class CurrentWeather(
    val time: String,
    val temperature: Float,
    val weathercode: Int,
    val windspeed: Float,
    val winddirection: Int,
    @SerialName(value = "is_day")
    val isDay: Int,
)
