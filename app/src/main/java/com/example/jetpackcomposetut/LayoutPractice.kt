package com.example.jetpackcomposetut

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun MainRowLayout() {
  Row() {
      RowLayout("Mandev")
      RowLayout(" Nii")
      RowLayout("Ankrah")
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