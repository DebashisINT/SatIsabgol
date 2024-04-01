package com.breezeisabgolfsm.features.document.api

import com.breezeisabgolfsm.features.dymanicSection.api.DynamicApi
import com.breezeisabgolfsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}