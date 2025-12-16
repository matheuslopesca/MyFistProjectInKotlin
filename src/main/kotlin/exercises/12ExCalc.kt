package main.kotlin.exercises

fun main(){

    println(
        readln()
            .toInt()
            .times(2)
            .times(2)
            .minus(10)
    )

    println(
        readln().
            toIntOrNull()
            ?: 2
            .times(2)
            .times(2)
            .minus(10)
    )
}