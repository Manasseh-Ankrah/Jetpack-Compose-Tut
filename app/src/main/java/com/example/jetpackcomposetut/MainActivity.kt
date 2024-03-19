package com.example.jetpackcomposetut

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column() {
                MainRowLayout()
//                Greeting("Android")
//                PrintName("Manasseh Manasseh Manasseh Manasseh Manasseh Manasseh Manasseh Manasseh Manasseh Manasseh Manasseh")
//                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}
