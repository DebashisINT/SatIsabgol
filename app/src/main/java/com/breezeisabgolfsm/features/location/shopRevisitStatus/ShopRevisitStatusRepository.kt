package com.breezeisabgolfsm.features.location.shopRevisitStatus

import com.breezeisabgolfsm.base.BaseResponse
import com.breezeisabgolfsm.features.location.model.ShopDurationRequest
import com.breezeisabgolfsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}