package com.honya.stickerslayshop

import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        val firstWord = if (Random.nextBoolean()) "Hi" else "Zig"
        return "$firstWord. Your platform is -> ${platform.name}!"
    }
}