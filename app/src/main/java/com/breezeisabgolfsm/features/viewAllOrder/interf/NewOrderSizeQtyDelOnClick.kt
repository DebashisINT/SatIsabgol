package com.breezeisabgolfsm.features.viewAllOrder.interf

import com.breezeisabgolfsm.app.domain.NewOrderGenderEntity
import com.breezeisabgolfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}