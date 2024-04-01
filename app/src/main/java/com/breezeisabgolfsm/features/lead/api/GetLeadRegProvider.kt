package com.breezeisabgolfsm.features.lead.api

import com.breezeisabgolfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.breezeisabgolfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}