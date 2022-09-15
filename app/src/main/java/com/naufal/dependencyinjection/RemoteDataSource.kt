package com.naufal.dependencyinjection

import javax.inject.Singleton

@Singleton
class RemoteDataSource {

    fun doNetworkCall(): String {
        return "Hello from remotedatasource"
    }
}