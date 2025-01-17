package com.breezeisabgolfsm.features.newcollection.model

import com.breezeisabgolfsm.app.domain.CollectionDetailsEntity
import com.breezeisabgolfsm.base.BaseResponse
import com.breezeisabgolfsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}