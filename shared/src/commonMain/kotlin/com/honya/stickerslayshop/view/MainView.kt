package com.honya.stickerslayshop.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.honya.stickerslayshop.Greeting

@Composable
fun MainView(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().background(color = Color.White),
    ) {
        Text(text = "Hello in MainView", fontSize = 22.sp)
        Text(text = Greeting().greet(), fontSize = 22.sp)
    }
}