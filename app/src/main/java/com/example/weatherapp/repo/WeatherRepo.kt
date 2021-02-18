package com.example.weatherapp.repo

import com.example.weatherapp.model.Weather
import com.example.weatherapp.repo.remote.RetrofitInstance

object WeatherRepo {
    val weatherService = RetrofitInstance.weatherService


    suspend fun getWeather() : Weather {
        return RetrofitInstance.weatherService.getWeatherCoroutines()
    }
}