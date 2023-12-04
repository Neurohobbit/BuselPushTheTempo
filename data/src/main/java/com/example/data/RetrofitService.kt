package com.example.data

import retrofit2.Response
import retrofit2.http.GET

interface RetrofitService {

    @GET("entries")
    suspend fun getApisList(): Response<Any>

    companion object {
        const val URL = "https://api.publicapis.org/"
    }
}
