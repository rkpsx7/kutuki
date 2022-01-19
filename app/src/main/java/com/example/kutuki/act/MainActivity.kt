package com.example.kutuki.act

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kutuki.R
import com.example.kutuki.act.di.DIComponents
import com.example.kutuki.act.di.DaggerDIComponents
import com.example.kutuki.act.repo.MainRepo
import com.example.kutuki.act.viewmodel.MainViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

//    private val repo = MainRepo()
//    private val vm = MainViewModel(repo)

    //private val vm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val daggerCom = DaggerDIComponents.create()
        val vm = daggerCom.getViewModel()

        CoroutineScope(IO).launch {
            Log.d("xtreme", "SizeR: ${vm.getDataFromApi().results?.toString()}")
        }

    }
}

