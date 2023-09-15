package com.example.weather.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun WeatherApp(
    weatherModel: WeatherViewModel = viewModel()
){
    Text(
        text = weatherModel.weatherUiState
    )
}

@Composable
fun CurrentWeatherCard(){

}

@Composable
fun HourlyForecast(){

}