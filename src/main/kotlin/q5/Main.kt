package q5

import kotlinx.coroutines.*

suspend fun currentThreadName(): String {
    delay(50)
    return Thread.currentThread().name
}

fun main() = runBlocking {
    println("before: " + Thread.currentThread().name)
    val result = currentThreadName()
    println("function returned: $result")
}
