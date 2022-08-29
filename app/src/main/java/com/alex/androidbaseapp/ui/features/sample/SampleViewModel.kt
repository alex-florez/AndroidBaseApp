package com.alex.androidbaseapp.ui.features.sample

import android.util.Log
import androidx.lifecycle.ViewModel

class SampleViewModel : ViewModel() {

    fun doWork() {
        Log.d("SampleViewModel", "Doing some work...")
    }
}