package com.hassanalwizrah.mylibrary

import com.google.gson.JsonObject
import retrofit2.http.GET
import retrofit2.http.Headers

interface ApiService {

    @Headers("Content-Type: application/json")
    @GET("data")
    fun getData(): retrofit2.Call<JsonObject>
}