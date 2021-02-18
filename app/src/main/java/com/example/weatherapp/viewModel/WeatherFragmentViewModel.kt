package com.example.weatherapp.viewModel

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModel
import java.io.File
import java.nio.file.Paths

@RequiresApi(Build.VERSION_CODES.O)
class WeatherFragmentViewModel: ViewModel() {

    private val TAG = "WeatherFragmentViewMode"
    val API_KEY:String = ApiKey.KEY
    init {

    }




}