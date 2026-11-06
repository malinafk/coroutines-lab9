package q10

import kotlinx.coroutines.*

suspend fun loadAvatar() {
    delay(200)
    println("avatar loaded")
}

suspend fun loadSettings() {
    delay(100)
    println("settings loaded")
}

fun main() = runBlocking {
    coroutineScope {
        launch { loadAvatar() }
        launch { loadSettings() }
    }
    println("Profile ready")

    launch {
        delay(100)
        println("extra coroutine done")
    }
    println("end of main")
}
