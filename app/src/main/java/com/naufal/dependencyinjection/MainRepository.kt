package com.naufal.dependencyinjection

class MainRepository(
    private val remoteDataSource: RemoteDataSource
) {

    fun doNetworkCall(): String {
        return remoteDataSource.doNetworkCall()
    }
}