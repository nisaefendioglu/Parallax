package com.nisaefendioglu.parallaxscrolleffect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nisaefendioglu.parallaxscrolleffect.ui.theme.ParallaxScrollEffectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //ParallaxEffect fonk kullanmak için scroll yapma durumunu tanımlıyoruz.
            val scrollState = rememberScrollState()
            ParallaxScrollEffectTheme() {
                Surface(color = MaterialTheme.colors.background) {
                    Scaffold() {
                        ParallaxEffect(scrollState)
                    }
                }
            }
        }
    }
}
