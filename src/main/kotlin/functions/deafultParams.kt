package main.kotlin.functions

fun main() {

    sayHello("Pedro", "Tdo bem?")
    sayHello()
}

private fun sayHello(name: String = "User", message: String = "") {

    println("Hi, $name! $message")
}