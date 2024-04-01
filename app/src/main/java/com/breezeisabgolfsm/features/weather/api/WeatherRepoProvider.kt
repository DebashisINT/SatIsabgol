package com.breezeisabgolfsm.features.weather.api

import com.breezeisabgolfsm.features.task.api.TaskApi
import com.breezeisabgolfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}