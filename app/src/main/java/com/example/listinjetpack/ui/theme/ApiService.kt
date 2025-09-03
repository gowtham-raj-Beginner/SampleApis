package com.example.listinjetpack.ui.theme

import retrofit2.http.GET

interface ApiService {
   @GET("users?page=2")
   suspend fun users(): UsersResponse
}


