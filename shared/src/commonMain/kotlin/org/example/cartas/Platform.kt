package org.example.cartas

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform