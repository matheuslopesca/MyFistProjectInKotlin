package main.kotlin.repetition

import main.kotlin.variables.x

fun main(){

    var x = 0
    do {
        print("$x ")
        x++
    } while (x <= 10)

    println()

    var y = 10
    while (y < 5){
        print("$y ")
    }

    println()

    do {
        print("$y ")
    } while (y < 5)
}