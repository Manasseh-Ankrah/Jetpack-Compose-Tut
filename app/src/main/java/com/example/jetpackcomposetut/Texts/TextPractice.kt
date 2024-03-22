package com.example.jetpackcomposetut

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetut.ui.theme.JetpackComposeTutTheme


@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        color = Color.Red,
        fontSize = 20.sp,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.Medium,
        fontFamily = FontFamily.Monospace,
        letterSpacing = 10.sp,
        textDecoration = TextDecoration.Underline,
    )
}

@Composable
fun PrintName(developer: String) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Gray),
        text = "Hello $developer, hope you good?",
        textAlign = TextAlign.Center,
        lineHeight = 30.sp,
        overflow = TextOverflow.Ellipsis,
        maxLines = 2,
        style = TextStyle(
            fontFamily = FontFamily.Cursive
        )
    )
}

@Composable
fun AnnotatedStringPractice(fontFamily:FontFamily) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        Text(
            //text = "Jetpack Compose Tutorial",
            // Using the buildAnnotatedString

            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp
                    )
                ) {
                    append("J")
                }
                append("etpack")
                withStyle(
                    style = SpanStyle(
                        color = Color.Green,
                        fontSize = 50.sp
                    )
                ) {
                    append("C")
                }
                append("ompose")

            },
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTutTheme {
        Column() {
            Greeting("Android")
            PrintName("Manasseh")
        }
    }
}