package com.example.weatherapp.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.adapters.WeatherFragmentAdapter
import com.example.weatherapp.adapters.WeatherFragmentAdapterDaily
import com.example.weatherapp.databinding.FragmentWeatherBinding
import com.example.weatherapp.viewModel.WeatherFragmentViewModel

class WeatherFragment: Fragment() {
    private  val TAG = "WeatherFragment"
    private  lateinit var binding: FragmentWeatherBinding
    private lateinit var  hourRecyclerView: RecyclerView
    private lateinit var weatherFragmentAdapter:WeatherFragmentAdapter
    private var hourWeatherList = mutableListOf<String>()
    private var dailyWeatherList = mutableListOf<String>()
    private lateinit var weatherFragmentAdapterDaily: WeatherFragmentAdapterDaily
    private lateinit var dailyRecyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentWeatherBinding.inflate(
        inflater,
        container,
        false
    ).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel = WeatherFragmentViewModel()
        binding.cityTv.text = viewModel.API_KEY
        initHourlyRecycleView()
        initDailyRecycleView()


    }

    fun initHourlyRecycleView(){
        hourWeatherList.addAll(listOf("aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa"))
        weatherFragmentAdapter = WeatherFragmentAdapter(hourWeatherList)
        hourRecyclerView = binding.hourRv
        var layoutManager = LinearLayoutManager(binding.root.context)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        hourRecyclerView.layoutManager = layoutManager
        hourRecyclerView.adapter = weatherFragmentAdapter
    }

    fun initDailyRecycleView(){
        dailyWeatherList.addAll(listOf("aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa"))
        weatherFragmentAdapterDaily = WeatherFragmentAdapterDaily(dailyWeatherList)
        val layoutManager = LinearLayoutManager(binding.root.context)
        dailyRecyclerView = binding.dailyRv
        dailyRecyclerView.adapter = weatherFragmentAdapterDaily
        dailyRecyclerView.layoutManager = layoutManager

    }

    companion object {
        fun newInstance() = WeatherFragment()
    }
}