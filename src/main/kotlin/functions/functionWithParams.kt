package main.kotlin.functions

fun main() {

    print("Digite seu nome: ")
    val name = readln()
    sayHello(name)

    sayHello("Pedro")
    sayHello("Maria")

}

private fun sayHello(name: String){
    println("Hi! $name!")
}