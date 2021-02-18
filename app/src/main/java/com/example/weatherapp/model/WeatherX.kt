package com.example.weatherapp.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WeatherX(
    val description: String?,
    val icon: String?,
    val id: Int?,
    val main: String?
)