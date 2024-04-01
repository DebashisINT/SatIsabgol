package com.breezeisabgolfsm.features.shopdetail.presentation.api.addcollection

import com.breezeisabgolfsm.app.NetworkConstant
import com.breezeisabgolfsm.base.BaseResponse
import com.breezeisabgolfsm.features.addshop.model.AddShopResponse
import com.breezeisabgolfsm.features.shopdetail.presentation.model.addcollection.AddCollectionInputParamsModel

import io.reactivex.Observable
import okhttp3.MultipartBody
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

/**
 * Created by Saikat on 13-11-2018.
 */
interface AddCollectionApi {

    @POST("Collection/AddCollection")
    fun addCollection(@Body addCollection: AddCollectionInputParamsModel?): Observable<BaseResponse>

    @Multipart
    @POST("CollectionFileUp/UploadDocforCollection")
    fun addCollectionMultipart(@Query("data") addCollection: String, @Part logo_img_data: MultipartBody.Part?): Observable<BaseResponse>


    /**
     * Companion object to create the ShopDurationApi
     */
    companion object Factory {
        fun create(): AddCollectionApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOutNoRetry())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(AddCollectionApi::class.java)
        }

        fun multipart(): AddCollectionApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOutNoRetry())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.ADD_SHOP_BASE_URL)
                    .build()

            return retrofit.create(AddCollectionApi::class.java)
        }
    }
}