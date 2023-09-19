package com.example.weather.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class Hourly (
    val time: Array<String>,
    @SerialName(value = "temperature_2m")
    val temperature2m: Array<Float>

)