package com.nisaefendioglu.parallaxview.ui
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable

@Composable
fun ParallaxTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        shapes = Shapes,
        content = content
    )
}