package q7

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("1")
    val job = launch {
        println("2")
        delay(100)
        println("3")
    }
    println("4")
    delay(50)
    println("5")
}
