package com.kmpbits.backgroundschedulerkmpdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform