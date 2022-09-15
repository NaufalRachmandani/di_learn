package com.naufal.dependencyinjection

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) {

    fun doNetworkCall(): String {
        return remoteDataSource.doNetworkCall()
    }
}