package com.breezeisabgolfsm.features.nearbyuserlist.api

import com.breezeisabgolfsm.app.Pref
import com.breezeisabgolfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezeisabgolfsm.features.newcollection.model.NewCollectionListResponseModel
import com.breezeisabgolfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}