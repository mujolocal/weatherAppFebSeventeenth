package com.example.weatherapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.R
import com.google.android.material.textview.MaterialTextView

class WeatherFragmentAdapter(var weathers: MutableList<String>): RecyclerView.Adapter<WeatherFragmentAdapter.CurrentWeatherEventView>()  {

  class CurrentWeatherEventView(view: View): RecyclerView.ViewHolder(view){
      val time: MaterialTextView
      val img : AppCompatImageView
      val temperature: MaterialTextView
      init {
          time = view.findViewById(R.id.hour_number_tv)
          img = view.findViewById(R.id.hour_iv)
          temperature = view.findViewById(R.id.hour_temp_tv)
      }

  }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrentWeatherEventView {
        val view = LayoutInflater.from(parent.context).inflate(
                R.layout.hour_weather_item,
                parent,
            false
                )
        return  CurrentWeatherEventView(view)
    }

    override fun onBindViewHolder(holder: CurrentWeatherEventView, position: Int) {
       holder.temperature.text = weathers[position]
        holder.time.text = weathers[position]
    }

    override fun getItemCount(): Int {
        return weathers.size
    }


}