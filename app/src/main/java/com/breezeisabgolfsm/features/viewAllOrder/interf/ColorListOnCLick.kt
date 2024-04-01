package com.breezeisabgolfsm.features.viewAllOrder.interf

import com.breezeisabgolfsm.app.domain.NewOrderGenderEntity
import com.breezeisabgolfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}