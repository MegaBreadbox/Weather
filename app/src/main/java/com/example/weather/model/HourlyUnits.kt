package com.example.weather.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class HourlyUnits(
    val time: String,
    @SerialName(value = "temperature_2m")
    val temperature2m: String
)