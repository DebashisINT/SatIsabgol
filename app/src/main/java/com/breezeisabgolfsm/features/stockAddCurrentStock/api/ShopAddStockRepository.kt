package com.breezeisabgolfsm.features.stockAddCurrentStock.api

import com.breezeisabgolfsm.base.BaseResponse
import com.breezeisabgolfsm.features.location.model.ShopRevisitStatusRequest
import com.breezeisabgolfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezeisabgolfsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezeisabgolfsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezeisabgolfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}