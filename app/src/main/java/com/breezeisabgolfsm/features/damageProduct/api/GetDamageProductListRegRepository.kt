package com.breezeisabgolfsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezeisabgolfsm.app.FileUtils
import com.breezeisabgolfsm.base.BaseResponse
import com.breezeisabgolfsm.features.NewQuotation.model.*
import com.breezeisabgolfsm.features.addshop.model.AddShopRequestData
import com.breezeisabgolfsm.features.addshop.model.AddShopResponse
import com.breezeisabgolfsm.features.damageProduct.model.DamageProductResponseModel
import com.breezeisabgolfsm.features.damageProduct.model.delBreakageReq
import com.breezeisabgolfsm.features.damageProduct.model.viewAllBreakageReq
import com.breezeisabgolfsm.features.login.model.userconfig.UserConfigResponseModel
import com.breezeisabgolfsm.features.myjobs.model.WIPImageSubmit
import com.breezeisabgolfsm.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}