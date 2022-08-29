package com.alex.androidbaseapp.ui.features.sample

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alex.androidbaseapp.data.repository.PostRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SampleViewModel @Inject constructor(
    private val postRepository: PostRepository
): ViewModel() {

    fun getPosts() {
        viewModelScope.launch {
            val remotePosts = postRepository.getRemotePosts()
            val localPosts = postRepository.getLocalPosts()

            Log.d(TAG, remotePosts.toString())
            Log.d(TAG, localPosts.toString())
        }
    }


    companion object {
        private const val TAG = "SampleViewModel"
    }
}