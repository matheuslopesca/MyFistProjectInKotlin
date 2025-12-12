package main.kotlin.selection

fun main(){

    val x = 10

    when {
        x > 0 -> println("Positivo")
        x < 0 -> println("Negativo")
        else -> println("ZERO")
    }


}