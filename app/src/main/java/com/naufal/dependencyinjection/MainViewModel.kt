package com.naufal.dependencyinjection

import androidx.lifecycle.ViewModel

class MainViewModel(private val mainRepository: MainRepository): ViewModel() {

    fun doNetworkCall(): String {
        return mainRepository.doNetworkCall()
    }
}