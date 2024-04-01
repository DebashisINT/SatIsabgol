package com.breezeisabgolfsm.features.survey.api

import com.breezeisabgolfsm.features.photoReg.api.GetUserListPhotoRegApi
import com.breezeisabgolfsm.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}