package q4

import kotlinx.coroutines.*

suspend fun loadUser(): String {
    delay(500)
    return "Bob"
}

// fix 1
fun printUserBlocking() {
    val user = runBlocking { loadUser() }
    println("fix 1: $user")
}

// fix 2
suspend fun printUserSuspend() {
    val user = loadUser()
    println("fix 2: $user")
}

fun main() = runBlocking {
    printUserBlocking()
    printUserSuspend()
}
