package com.breezeisabgolfsm.features.stockCompetetorStock.api

import com.breezeisabgolfsm.base.BaseResponse
import com.breezeisabgolfsm.features.orderList.model.NewOrderListResponseModel
import com.breezeisabgolfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezeisabgolfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}