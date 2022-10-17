package ru.ukenov.findtime

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform