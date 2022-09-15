package com.naufal.dependencyinjection

import androidx.lifecycle.ViewModel

class MainViewModel(): ViewModel() {

    private val mainRepositoryImpl = MainRepository(RemoteDataSource())

    fun doNetworkCall(): String {
        return mainRepositoryImpl.doNetworkCall()
    }
}