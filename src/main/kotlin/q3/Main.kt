package q3

import kotlinx.coroutines.*

suspend fun loadUser() {
    println("loading user")
    delay(300)
    checkPassword()
}

suspend fun checkPassword() {
    println("checking password")
    delay(200)
    openProfile()
}

suspend fun openProfile() {
    println("opening profile")
    delay(100)
    println("profile is open")
}

suspend fun main() {
    println("start")
    loadUser()
    println("finish")
}
