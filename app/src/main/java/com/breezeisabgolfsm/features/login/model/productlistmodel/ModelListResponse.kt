package com.breezeisabgolfsm.features.login.model.productlistmodel

import com.breezeisabgolfsm.app.domain.ModelEntity
import com.breezeisabgolfsm.app.domain.ProductListEntity
import com.breezeisabgolfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}