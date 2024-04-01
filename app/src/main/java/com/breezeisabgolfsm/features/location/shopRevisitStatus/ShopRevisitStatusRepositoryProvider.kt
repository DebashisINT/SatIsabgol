package com.breezeisabgolfsm.features.location.shopRevisitStatus

import com.breezeisabgolfsm.features.location.shopdurationapi.ShopDurationApi
import com.breezeisabgolfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}