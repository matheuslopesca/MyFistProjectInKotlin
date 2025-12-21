package main.kotlin.functions

fun main() {

    sayHello("Pedro", 23)
    sayHello("Maria", 25)

}

private fun sayHello(name: String, temperature: Int){
    println("Hi, $name! Temperature is $temperature degrees.")
}