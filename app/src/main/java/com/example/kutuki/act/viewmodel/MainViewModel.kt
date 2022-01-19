package com.example.kutuki.act.viewmodel

import androidx.lifecycle.ViewModel
import com.example.kutuki.act.DataModels.ResponseDTO
import com.example.kutuki.act.repo.MainRepo
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repo:MainRepo) : ViewModel() {
    suspend fun getDataFromApi():ResponseDTO{
       return repo.getMoviesData()
    }
}