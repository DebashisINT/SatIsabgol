package com.breezeisabgolfsm.features.dashboard.presentation.api.dayStartEnd

import com.breezeisabgolfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.breezeisabgolfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}