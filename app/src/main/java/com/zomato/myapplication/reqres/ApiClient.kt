package com.zomato.myapplication.reqres

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

/**
 * created by championswimmer on 2019-06-11
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */

interface ReqResAPI {

    @GET("users")
    fun getUsers(): Call<UsersResponse>

}

object ApiClient {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://reqres.in/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val reqResClient = retrofit.create(ReqResAPI::class.java)
}