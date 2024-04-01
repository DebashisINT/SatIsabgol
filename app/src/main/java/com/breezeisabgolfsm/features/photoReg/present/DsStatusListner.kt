package com.breezeisabgolfsm.features.photoReg.present

import com.breezeisabgolfsm.app.domain.ProspectEntity
import com.breezeisabgolfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}