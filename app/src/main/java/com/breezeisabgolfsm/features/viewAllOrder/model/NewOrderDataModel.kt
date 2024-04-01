package com.breezeisabgolfsm.features.viewAllOrder.model

import com.breezeisabgolfsm.app.domain.NewOrderColorEntity
import com.breezeisabgolfsm.app.domain.NewOrderGenderEntity
import com.breezeisabgolfsm.app.domain.NewOrderProductEntity
import com.breezeisabgolfsm.app.domain.NewOrderSizeEntity
import com.breezeisabgolfsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

