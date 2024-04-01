package com.breezeisabgolfsm.features.orderhistory.activitiesapi

import com.breezeisabgolfsm.app.Pref
import com.breezeisabgolfsm.base.BaseResponse
import com.breezeisabgolfsm.features.orderhistory.model.FetchLocationRequest
import com.breezeisabgolfsm.features.orderhistory.model.FetchLocationResponse
import com.breezeisabgolfsm.features.orderhistory.model.SubmitLocationInputModel
import com.breezeisabgolfsm.features.orderhistory.model.UnknownReponseModel
import io.reactivex.Observable

/**
 * Created by Pratishruti on 30-11-2017.
 */
class LocationFetchRepository(val apiService: LocationFetchApi){
    fun fetchLocationUpdate(location: FetchLocationRequest): Observable<FetchLocationResponse> {
        return apiService.getLocationUpdates(location)
    }

    fun fetchLocationUpdate(date: String): Observable<FetchLocationResponse> {
        return apiService.getLocationUpdates(Pref.session_token!!, Pref.user_id!!, date)
    }

    fun fetchUnknownLocation(): Observable<UnknownReponseModel> {
        return apiService.getUnknownLocation(Pref.session_token!!, Pref.user_id!!)
    }

    fun submitLoc(loc: SubmitLocationInputModel): Observable<BaseResponse> {
        return apiService.submitLocation(loc)
    }
}