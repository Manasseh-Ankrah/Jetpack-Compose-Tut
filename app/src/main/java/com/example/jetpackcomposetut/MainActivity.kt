package com.example.jetpackcomposetut

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Defining font resource

        val fontFamily = FontFamily(
            Font(R.font.inter_thin, FontWeight.Thin),
            Font(R.font.inter_light, FontWeight.Light),
            Font(R.font.inter_extra_light, FontWeight.ExtraLight),
            Font(R.font.inter_regular, FontWeight.Normal),
            Font(R.font.inter_medium, FontWeight.Medium),
            Font(R.font.inter_semi_bold, FontWeight.SemiBold),
            Font(R.font.inter_bold, FontWeight.Bold),
            Font(R.font.inter_extra_bold, FontWeight.ExtraBold)
            )

        setContent {
            Column() {
                AnnotatedStringPractice(fontFamily)
                //MainRowLayout()
                //Greeting("Android")
                //PrintName("Manasseh Manasseh Manasseh Manasseh Manasseh Manasseh Manasseh Manasseh Manasseh Manasseh Manasseh")
                //Spacer(modifier = Modifier.height(20.dp))


            }
        }
    }
}
