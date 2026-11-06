package q6

import kotlinx.coroutines.*

fun main() = runBlocking {
    repeat(10) { index ->
        val number = index + 1
        launch {
            println("download $number started, thread: ${Thread.currentThread().name}")
            delay(1000)
            println("download $number finished")
        }
    }
}
