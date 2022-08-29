package com.alex.androidbaseapp.ui.features.sample.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SampleText(modifier: Modifier = Modifier) {
    Text(modifier = modifier, text = "This is a sample text created with Compose")
}

@Composable
@Preview
private fun SampleTextPreview() {
    SampleText()
}