package com.example.weatherapp.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Current(
    val clouds: Int?,
    val dew_point: Double?,
    val dt: Int?,
    val feels_like: Double?,
    val humidity: Int?,
    val pressure: Int?,
    val sunrise: Int?,
    val sunset: Int?,
    val temp: Int?,
    val uvi: Int?,
    val visibility: Int?,
    val weather: List<WeatherX>?,
    val wind_deg: Int?,
    val wind_speed: Double?
)