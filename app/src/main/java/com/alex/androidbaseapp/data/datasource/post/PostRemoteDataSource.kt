package com.alex.androidbaseapp.data.datasource.post

import com.alex.androidbaseapp.data.model.PostData
import javax.inject.Inject

class PostRemoteDataSource @Inject constructor() : PostDataSource {
    override suspend fun getPosts(): List<PostData> = listOf(
        PostData(1, 1, "Post of user 1", "Post from remote server"),
        PostData(2, 1, "Post 2 of user 1", "Post 2 from remote server"),
    )
}