package main.kotlin.repetition

fun main() {
    val x = 10

    if (x == 10) {
        val y = 5
        println(y)
    }

    for (i in 1..x) {
        println(i)
    }

    while (x == 10){
        val j = x
        println(j)
    }

    do {
        val z = 5
    } while (z == 10)

    val y: Int
    if (x == 10) {
        y = 10
    } else {
        y = 0
    }
    println(y)
}