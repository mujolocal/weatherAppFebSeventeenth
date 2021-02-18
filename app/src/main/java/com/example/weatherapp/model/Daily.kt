package com.example.weatherapp.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Daily(
    val clouds: Double?,
    val dew_poDouble: Double?,
    val dt: Double?,
    val feels_like: FeelsLike?,
    val humidity: Double?,
    val pop: Double?,
    val pressure: Double?,
    val snow: Double?,
    val sunrise: Double?,
    val sunset: Double?,
    val temp: Temp?,
    val uvi: Double?,
    val weather: List<WeatherXX>?,
    val wind_deg: Double?,
    val wind_speed: Double?
)