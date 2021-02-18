package com.example.weatherapp.viewModel

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.model.Weather
import com.example.weatherapp.repo.WeatherRepo
import com.example.weatherapp.repo.remote.RetrofitInstance.weatherService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File
import java.nio.file.Paths

@RequiresApi(Build.VERSION_CODES.O)
class WeatherFragmentViewModel: ViewModel() {

    private val TAG = "WeatherFragmentViewMode"
    val API_KEY:String = ApiKey.KEY

    private val _weathers = MutableLiveData<Weather>()

    val weathers: LiveData<Weather>
        get() = _weathers
    init {
        val callback : Callback<Weather> = object : Callback<Weather> {
            override fun onResponse(call: Call<Weather>, response: Response<Weather>) {
                _weathers.value = response.body()
            }

            override fun onFailure(call: Call<Weather>, t: Throwable) {
                Log.e(TAG, "onFailure: ", t)
            }
        }


    }

    fun getWeathers() {
        viewModelScope.launch(Dispatchers.Main) {
            val weather = WeatherRepo.getWeather()
            _weathers.value = weather
        }
    }




}