package com.naufal.dependencyinjection.di

import com.naufal.dependencyinjection.MainRepository
import com.naufal.dependencyinjection.RemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
class AppModule {
//    @Singleton
//    @Provides
//    fun provideRepository(remoteDataSource: RemoteDataSource): MainRepository {
//        return MainRepository(remoteDataSource)
//    }

    @Singleton
    @Provides
    fun provideRepository(): RemoteDataSource {
        return RemoteDataSource()
    }
}
