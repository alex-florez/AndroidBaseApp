package com.alex.androidbaseapp.ui.features.sample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.viewModels
import com.alex.androidbaseapp.R
import com.alex.androidbaseapp.ui.features.sample.components.SampleText
import com.alex.androidbaseapp.ui.theme.AndroidBaseAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SampleFragment : Fragment() {

    private val viewModel: SampleViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = ComposeView(requireContext()).apply {
        setContent {
            AndroidBaseAppTheme {
                Box(
                    contentAlignment = Alignment.Center
                ) {
                    SampleText(modifier = Modifier)
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        viewModel.getPosts()
    }
}