package com.alex.androidbaseapp.di

import com.alex.androidbaseapp.data.datasource.post.PostDataSource
import com.alex.androidbaseapp.data.datasource.post.PostLocalDataSource
import com.alex.androidbaseapp.data.datasource.post.PostRemoteDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Module
    @InstallIn(SingletonComponent::class)
    abstract class DataSourceModule {

        @PostRemoteDataSourceDependency
        @Binds
        abstract fun bindPostRemoteDataSource(
            postRemoteDataSource: PostRemoteDataSource
        ): PostDataSource

        @PostLocalDataSourceDependency
        @Binds
        abstract fun bindPostLocalDataSource(
            postLocalDataSource: PostLocalDataSource
        ): PostDataSource

        // Annotion for Remote Post Data source
        @Qualifier
        @Retention(AnnotationRetention.BINARY)
        annotation class PostRemoteDataSourceDependency

        // Annotion for Local Post Data source
        @Qualifier
        @Retention(AnnotationRetention.BINARY)
        annotation class PostLocalDataSourceDependency
    }
}


