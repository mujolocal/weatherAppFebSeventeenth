package com.example.weatherapp.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Hourly(
    val clouds: Int?,
    val dew_point: Double?,
    val dt: Int?,
    val feels_like: Double?,
    val humidity: Int?,
    val pop: Int?,
    val pressure: Int?,
    val snow: Snow?,
    val temp: Int?,
    val uvi: Int?,
    val visibility: Int?,
    val weather: List<WeatherXXX>?,
    val wind_deg: Int?,
    val wind_gust: Double?,
    val wind_speed: Double?
)