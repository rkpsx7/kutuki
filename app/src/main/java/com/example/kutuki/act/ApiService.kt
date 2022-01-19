package com.example.kutuki.act

import com.example.kutuki.act.DataModels.ResponseDTO
import dagger.Component
import dagger.Provides
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Inject

interface ApiService {

    @GET("3/discover/movie")
    suspend fun getMoviesData(
        @Query("api_key") api_key: String = "328c283cd27bd1877d9080ccb1604c91"
    ): ResponseDTO
}