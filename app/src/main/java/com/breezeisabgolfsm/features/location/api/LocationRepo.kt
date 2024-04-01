package com.breezeisabgolfsm.features.location.api

import com.breezeisabgolfsm.app.Pref
import com.breezeisabgolfsm.base.BaseResponse
import com.breezeisabgolfsm.features.location.model.AppInfoInputModel
import com.breezeisabgolfsm.features.location.model.AppInfoResponseModel
import com.breezeisabgolfsm.features.location.model.GpsNetInputModel
import com.breezeisabgolfsm.features.location.model.ShopDurationRequest
import com.breezeisabgolfsm.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }

    fun gpsNetInfo(appInfo: GpsNetInputModel?): Observable<BaseResponse> {
        return apiService.submitGpsNetInfo(appInfo)
    }
}