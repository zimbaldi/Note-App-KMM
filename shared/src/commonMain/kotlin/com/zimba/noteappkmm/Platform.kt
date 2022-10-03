package com.zimba.noteappkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform