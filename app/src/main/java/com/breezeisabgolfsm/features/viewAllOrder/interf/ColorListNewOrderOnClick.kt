package com.breezeisabgolfsm.features.viewAllOrder.interf

import com.breezeisabgolfsm.app.domain.NewOrderColorEntity
import com.breezeisabgolfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}