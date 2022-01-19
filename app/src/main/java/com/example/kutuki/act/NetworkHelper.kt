package com.example.kutuki.act

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkHelper {
    private val httpLoggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    private fun getInstance(): Retrofit {
        return  Retrofit.Builder()
            .baseUrl("http://api.themoviedb.org")
            .addConverterFactory(GsonConverterFactory.create())
            //.addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .client(OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build())
            .build()
    }

    fun getApiService() = getInstance().create(ApiService::class.java)

}