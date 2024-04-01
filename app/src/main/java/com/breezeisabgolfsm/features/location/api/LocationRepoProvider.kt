package com.breezeisabgolfsm.features.location.api

import com.breezeisabgolfsm.features.location.shopdurationapi.ShopDurationApi
import com.breezeisabgolfsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}