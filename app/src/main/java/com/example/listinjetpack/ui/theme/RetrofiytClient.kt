package com.example.listinjetpack.ui.theme

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofiytClient {
    val apiService: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://reqres.in/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}