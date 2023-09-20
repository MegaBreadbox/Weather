package com.example.weather.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.weather.R
import com.example.weather.model.Weather

@Composable
fun WeatherApp(
    weatherModel: WeatherViewModel = viewModel(),
    modifier: Modifier = Modifier
){

    when(val weatherState = weatherModel.weatherUiState) {
        is WeatherUiState.Loading -> Text(text = "loading")
        is WeatherUiState.Success ->
            CurrentWeatherCard(
                weather = weatherState.weather,
                modifier = modifier
                    .height(200.dp)
                    .fillMaxWidth()

            )
        is WeatherUiState.Error -> Text(text = "Error")

    }
}

@Composable
fun CurrentWeatherCard(weather: Weather,modifier: Modifier = Modifier){
    Card(
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.secondaryContainer),
        modifier = modifier
            .padding(16.dp)
    ) {
        Text(
            text = "Current weather in ${weather.timezone} \n${weather.timezoneAbbreviation}",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(CenterHorizontally)
                .padding(8.dp)
        )
        //Spacer(Modifier.padding(8.dp))
        weatherEntry(entryValue = "${weather.currentWeather.temperature} °C")
        weatherEntry(entryValue = "${weather.currentWeather.windspeed} Km/h wind speed")
        HourlyForecastCard()
    }
}

@Composable
fun weatherEntry(entryValue: String, modifier: Modifier = Modifier) {
    Text(
        text = entryValue,
        modifier = modifier.padding(start = 24.dp)
    )
}

@Composable
fun HourlyForecastList(modifier: Modifier = Modifier){

}

@Composable
fun HourlyForecastCard(time: String, temperature: String, modifier: Modifier = Modifier){
    Card(
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.secondary),

    ) {

    }
}