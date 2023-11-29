package com.honya.stickerslayshop

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform