package com.example.weather.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Weather(
    val latitude: Float,
    val longitude: Float,
    val elevation: Float,
    @SerialName(value = "generationtime_ms")
    val generationTimeMs: Float,
    @SerialName ("utc_offset_seconds")
    val utcOffsetSeconds: Int,
    val timezone: String,
    @SerialName ("timezone_abbreviation")
    val timezoneAbbreviation: String,
    @SerialName(value = "current_weather")
    val currentWeather: CurrentWeather,
    @SerialName(value = "hourly_units")
    val hourlyUnits: HourlyUnits,
    val hourly: Hourly

)