package org.tf.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform