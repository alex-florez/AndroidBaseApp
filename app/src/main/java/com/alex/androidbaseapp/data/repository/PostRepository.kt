package com.alex.androidbaseapp.data.repository

import com.alex.androidbaseapp.data.datasource.post.PostDataSource
import com.alex.androidbaseapp.data.model.PostData
import com.alex.androidbaseapp.di.DataModule
import com.alex.androidbaseapp.di.DataModule.DataSourceModule.PostRemoteDataSourceDependency
import com.alex.androidbaseapp.di.DataModule.DataSourceModule.PostLocalDataSourceDependency
import com.alex.androidbaseapp.domain.model.Post
import javax.inject.Inject

class PostRepository @Inject constructor(
    @PostRemoteDataSourceDependency private val remoteDataSource: PostDataSource,
    @PostLocalDataSourceDependency private val localDataSource: PostDataSource
) {

    suspend fun getRemotePosts(): List<PostData> = remoteDataSource.getPosts()
    suspend fun getLocalPosts(): List<PostData> = localDataSource.getPosts()

}