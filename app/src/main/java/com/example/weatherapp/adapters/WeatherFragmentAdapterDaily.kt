package com.example.weatherapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.R
import com.google.android.material.textview.MaterialTextView

class WeatherFragmentAdapterDaily(var weathers: MutableList<String>):RecyclerView.Adapter<WeatherFragmentAdapterDaily.DailyWeatherEventView>() {
    class DailyWeatherEventView(view:View): RecyclerView.ViewHolder(view){
        lateinit var day: MaterialTextView
        lateinit var img: AppCompatImageView
        lateinit var temperature: MaterialTextView

        init{
            day = view.findViewById(R.id.daily_day_tv)
            img = view.findViewById(R.id.daily_day_iv)
            temperature = view.findViewById(R.id.daily_temp_tv)

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyWeatherEventView {

        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.daily_weather_item,
            parent,
            false
        )
        return  DailyWeatherEventView(view)
    }

    override fun onBindViewHolder(holder: DailyWeatherEventView, position: Int) {
        holder.temperature.text = weathers[position]
    }

    override fun getItemCount(): Int {
        return 7
    }
}