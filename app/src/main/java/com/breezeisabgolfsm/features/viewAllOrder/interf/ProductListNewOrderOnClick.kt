package com.breezeisabgolfsm.features.viewAllOrder.interf

import com.breezeisabgolfsm.app.domain.NewOrderGenderEntity
import com.breezeisabgolfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}