package com.breezeisabgolfsm.features.newcollectionreport

import com.breezeisabgolfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}