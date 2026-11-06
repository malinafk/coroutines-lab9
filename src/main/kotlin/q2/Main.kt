package q2

import kotlinx.coroutines.*

val drinks = listOf("espresso" to 300L, "tea" to 100L, "latte" to 200L)

fun withDelay() = runBlocking {
    for ((drink, time) in drinks) {
        launch {
            println("start $drink")
            delay(time)
            println("end $drink")
        }
    }
}

fun withSleep() = runBlocking {
    for ((drink, time) in drinks) {
        launch {
            println("start $drink")
            Thread.sleep(time)
            println("end $drink")
        }
    }
}

fun main() {
    println("delay:")
    withDelay()
    println("sleep:")
    withSleep()
}
