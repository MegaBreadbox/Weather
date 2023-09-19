package com.example.weather.network

import com.example.weather.model.Weather
import retrofit2.http.GET

interface WeatherApiService {
    @GET("v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m&current_weather=true&timezone=auto")
    suspend fun getWeather(): Weather
}