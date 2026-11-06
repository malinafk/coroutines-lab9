package q9

import kotlinx.coroutines.*

fun main() = runBlocking {
    val screen = launch {
        repeat(2) { i ->
            val id = i + 1
            launch {
                try {
                    delay(1000)
                    println("request $id done")
                } finally {
                    println("request $id cleanup")
                }
            }
        }
    }
    delay(100)
    screen.cancelAndJoin()
    println("end")
}
