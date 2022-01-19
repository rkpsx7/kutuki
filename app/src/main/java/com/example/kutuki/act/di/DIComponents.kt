package com.example.kutuki.act.di

import com.example.kutuki.act.ApiService
import com.example.kutuki.act.NetworkHelper
import com.example.kutuki.act.repo.MainRepo
import com.example.kutuki.act.viewmodel.MainViewModel
import dagger.Component

@Component
interface DIComponents {

    fun getRepo(): MainRepo
    fun getViewModel():MainViewModel
}