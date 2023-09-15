package com.example.weather.network

import retrofit2.http.GET

interface WeatherApiService {
    @GET("v1/forecast?latitude=52.52&longitude=13.41&hourl" +
            "y=temperature_2m&current_weather=true&timezone=auto")
    suspend fun getWeather(): String
}