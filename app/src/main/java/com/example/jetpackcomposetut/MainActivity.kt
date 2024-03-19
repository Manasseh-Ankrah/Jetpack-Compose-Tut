package com.example.jetpackcomposetut

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetut.ui.theme.JetpackComposeTutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column() {
                Greeting("Android")
                PrintName("Manasseh Manasseh Manasseh Manasseh Manasseh Manasseh Manasseh Manasseh Manasseh Manasseh Manasseh")
            }
        }
    }
}

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