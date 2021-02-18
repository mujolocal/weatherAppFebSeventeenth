package com.example.weatherapp.repo.remote

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitInstance {
    private val BASE_URL = "https://api.openweathermap.org/"

    private val client = HttpLoggingInterceptor()
    .apply {
        level = HttpLoggingInterceptor.Level.BODY
    }
    .let { loginInterceptor ->
        OkHttpClient.Builder().addInterceptor(loginInterceptor).build()
    }

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .client(client)
        .build()

    val weatherService: WeatherService by lazy { retrofit.create(WeatherService::class.java) }
}