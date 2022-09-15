package com.naufal.dependencyinjection.di

import com.naufal.dependencyinjection.MainRepository
import com.naufal.dependencyinjection.MainViewModel
import com.naufal.dependencyinjection.RemoteDataSource
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    // single instance of RemoteDataSource
    single<RemoteDataSource> { RemoteDataSource() }

    // single instance of MainRepository
    single<MainRepository> { MainRepository(remoteDataSource = get()) }

    // simple viewmodel
    viewModel { MainViewModel(mainRepository = get()) }
}