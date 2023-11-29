package com.honya.stickerslayshop

import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.res.useResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import com.honya.stickerslayshop.view.MainView

fun main() = singleWindowApplication(
    title = "Sticker Slay Shop",
    state = WindowState(width = 800.dp, height = 600.dp),
) {
    MainView()
}