package q8

import kotlinx.coroutines.*

fun main() = runBlocking {
    val report = launch {
        val compress = launch {
            delay(200)
            println("child done")
        }
        println("parent body done")
    }
    report.join()
    println("report completed")
}
