package com.alex.androidbaseapp.data.datasource.post

import com.alex.androidbaseapp.data.model.PostData
import javax.inject.Inject

class PostLocalDataSource @Inject constructor() : PostDataSource {
    override suspend fun getPosts(): List<PostData> = listOf(
        PostData(1, 2, "Post of user 2", "Post from local database"),
        PostData(2, 2, "Post 2 of user 2", "Post 2 from local database"),
    )
}