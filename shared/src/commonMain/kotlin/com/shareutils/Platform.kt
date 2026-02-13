package com.shareutils

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform