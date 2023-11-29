plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.compose)
}

kotlin {
    jvm("desktop")
    sourceSets{
        val desktopMain by getting {
            dependencies{
                implementation(compose.desktop.currentOs)
                implementation(project(":shared"))
            }
        }
    }
}

compose.desktop {
    application {
        mainClass = "com.honya.stickerslayshop.MainKt"
    }
}

