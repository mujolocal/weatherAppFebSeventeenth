package com.example.weatherapp.repo.remote

import com.example.weatherapp.model.Weather
import retrofit2.http.GET
import retrofit2.http.Query
 interface WeatherService{
    @GET("data/2.5/onecall?lat=40.009380&lon=40.009380&appid=8d49f5e8cf2c711a4bbde023564032f8&units=imperial")
    suspend fun getWeatherCoroutines(
    ):Weather

}