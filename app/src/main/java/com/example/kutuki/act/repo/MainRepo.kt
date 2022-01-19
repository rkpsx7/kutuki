package com.example.kutuki.act.repo

import com.example.kutuki.act.DataModels.ResponseDTO
import com.example.kutuki.act.NetworkHelper
import javax.inject.Inject

class MainRepo @Inject constructor() {

    private val api = NetworkHelper.getApiService()
    suspend fun getMoviesData() :ResponseDTO{
        return api.getMoviesData()
    }

}