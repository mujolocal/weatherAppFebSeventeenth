package com.example.weatherapp.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Snow(
    val `1h`: Double?
)