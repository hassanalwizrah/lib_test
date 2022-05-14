package com.hassanalwizrah.mylibrary

import android.content.Context
import android.util.Log
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Response

object NetworkTest {

    fun callNetwork(context: Context) {

        val call = ApiClient.getInstance(context).getData()
        call.enqueue(object : retrofit2.Callback<JsonObject> {
            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
                Log.d("network call", "Response code: " + response.code())
            }

            override fun onFailure(call: Call<JsonObject>, t: Throwable) {
                Log.d("network call", "Failed: " + t.message)
            }
        })
    }
}