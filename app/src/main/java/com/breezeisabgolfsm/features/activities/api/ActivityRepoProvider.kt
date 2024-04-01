package com.breezeisabgolfsm.features.activities.api

import com.breezeisabgolfsm.features.member.api.TeamApi
import com.breezeisabgolfsm.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}