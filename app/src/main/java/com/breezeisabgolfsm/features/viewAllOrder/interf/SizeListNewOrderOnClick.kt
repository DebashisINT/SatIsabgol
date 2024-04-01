package com.breezeisabgolfsm.features.viewAllOrder.interf

import com.breezeisabgolfsm.app.domain.NewOrderProductEntity
import com.breezeisabgolfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}