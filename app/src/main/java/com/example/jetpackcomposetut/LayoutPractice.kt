package com.example.jetpackcomposetut

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun MainRowLayout() {
 Column() {
     Row() {
         RowLayout("Mandev")
         RowLayout(" Nii")
         RowLayout("Ankrah")
     }
     Row() {
         RowLayout("Mandev")
         RowLayout(" Nii")
         RowLayout("Ankrah")
     }
     Row() {
         RowLayout("Mandev")
         RowLayout(" Nii")
         RowLayout("Ankrah")
     }
     
 }

}

@Composable
fun RowLayout(value: String) {
    Text(text = "Hello $value")
}


@Preview(showBackground= true, showSystemUi = true)
@Composable
fun RowLayoutPreview() {
    MainRowLayout()
}