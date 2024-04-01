package com.breezeisabgolfsm.features.viewAllOrder.orderOptimized

import com.breezeisabgolfsm.app.domain.ProductOnlineRateTempEntity
import com.breezeisabgolfsm.base.BaseResponse
import com.breezeisabgolfsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}