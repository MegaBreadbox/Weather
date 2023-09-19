package com.example.weather.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun WeatherApp(
    weatherModel: WeatherViewModel = viewModel()
){

    when(val weatherState = weatherModel.weatherUiState) {
        is WeatherUiState.Loading -> Text(text = "loading")
        is WeatherUiState.Success -> Text(text = weatherState.weather.currentWeather.temperature.toString())
        is WeatherUiState.Error -> Text(text = "Error")

    }
}

@Composable
fun CurrentWeatherCard(){

}

@Composable
fun HourlyForecast(){

}