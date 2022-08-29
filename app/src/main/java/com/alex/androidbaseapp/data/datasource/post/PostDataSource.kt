package com.alex.androidbaseapp.data.datasource.post

import com.alex.androidbaseapp.data.model.PostData
import com.alex.androidbaseapp.domain.model.Post

interface PostDataSource {
    suspend fun getPosts(): List<PostData>
}