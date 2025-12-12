package main.kotlin.selection

fun main(){

    val x = 10

    val s = when {
        x > 0 -> "Positivo"
        x < 0 -> "Negativo"
        else -> "ZERO"
    }
    println(s)

    val y = -10

    println(
        when {
            y > 0 -> "Positivo"
            y < 0 -> "Negativo"
            else -> "ZERO"
        }
    )

    val s2 = 'c'
    val v = when(s2) {
        'A', 'a' -> 1
        'B', 'b' -> 2
        else -> 3
    }
    println(v)
}