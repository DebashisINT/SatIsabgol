package com.breezeisabgolfsm.features.weather.api

import com.breezeisabgolfsm.base.BaseResponse
import com.breezeisabgolfsm.features.task.api.TaskApi
import com.breezeisabgolfsm.features.task.model.AddTaskInputModel
import com.breezeisabgolfsm.features.weather.model.ForeCastAPIResponse
import com.breezeisabgolfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}