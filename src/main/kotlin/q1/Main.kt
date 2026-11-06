package q1

import kotlinx.coroutines.*

suspend fun makeCoffee() {
    delay(1000)
    println("Coffee ready")
}

fun main() = runBlocking {
    launch { makeCoffee() }
    println("Order accepted")
}
