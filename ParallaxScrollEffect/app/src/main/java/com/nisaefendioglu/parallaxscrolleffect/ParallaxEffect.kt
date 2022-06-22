package com.nisaefendioglu.parallaxscrolleffect

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.*
import kotlin.math.*

@Composable
fun ParallaxEffect(scrollState: ScrollState) {
    val text = "Android software development is the process by which applications are created for devices running the Android operating system. Google states that[3] \"Android apps can be written using Kotlin, Java, and C++ languages\" using the Android software development kit (SDK), while using other languages is also possible. All non-Java virtual machine (JVM) languages, such as Go, JavaScript, C, C++ or assembly, need the help of JVM language code, that may be supplied by tools, likely with restricted API support. Some programming languages and tools allow cross-platform app support (i.e. for both Android and iOS). Third party tools, development environments, and language support have also continued to evolve and expand since the initial SDK was released in 2008. The official Android app distribution mechanism to end users is Google Play; it also allows staged gradual app release, as well as distribution of pre-release app versions to testers."
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column {
            TopAppBar(
                // Header style in TopAppBar field
                title = {
                    Text(
                        text = "Android Software Development",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )
                }
            )

            Column(
                //Defining verticalScroll to scroll on the Y axis
                modifier = Modifier
                    .verticalScroll(scrollState)
                    .fillMaxSize()
            ) {
                val height = 320.dp
                Image(
                    // Determine the image used
                    painter = painterResource(id = R.drawable.android),
                    contentDescription = "Android Image",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(height)
                        .graphicsLayer {
                            //Creating the fade image in the scrolling process
                            alpha = min(
                                1f,
                                max(
                                    0.0f,
                                    1 - (scrollState.value / ((height.value * 2) + (height.value / 1.5f)))
                                )
                            )
                        }
                )
                //Defining the style properties for the content text
                Text(
                    text = text,
                    color = Color.White,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif,
                    modifier = Modifier.padding(20.dp),
                    style = TextStyle(
                        lineHeight = 30.sp,
                        textAlign = TextAlign.Center
                    )
                )
            }
        }
    }
}