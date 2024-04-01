package com.breezeisabgolfsm.features.orderList.model

import com.breezeisabgolfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}