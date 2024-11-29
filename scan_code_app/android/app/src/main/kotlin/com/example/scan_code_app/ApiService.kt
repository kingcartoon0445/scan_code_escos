package com.example.scan_code_app

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("api/v1/app/auth/token/get")
    fun getToken(@Body request: SendGetTokenBean): Call<GetTokenBean>
}

object RetrofitClient {
    private const val BASE_URL = "https://ar2.accessreal.com:443/"
    
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService: ApiService = retrofit.create(ApiService::class.java)
}