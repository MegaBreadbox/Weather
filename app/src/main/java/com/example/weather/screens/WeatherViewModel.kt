package com.example.weather.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weather.model.Weather
import com.example.weather.network.DefaultAppContainer
import kotlinx.coroutines.launch

sealed interface WeatherUiState {
    data class Success(val weather: Weather): WeatherUiState
    object Error : WeatherUiState
    object Loading : WeatherUiState
}

class WeatherViewModel : ViewModel() {
    var weatherUiState: WeatherUiState by mutableStateOf(WeatherUiState.Loading)
        private set

    init{
        getWeather()
    }

    fun getWeatherDetails(){
    }

    private fun getWeather() {
        viewModelScope.launch {
            val weather = DefaultAppContainer().retrofitService.getWeather()
            weatherUiState = WeatherUiState.Success(
                weather
            )
        }
    }
}