package main.kotlin.functions

fun main() {

    val r = calculate(20,10)
    println(r)
    println(calculate(20,10))
}

private fun calculate(a: Int, b: Int): Int {
    //val r = a + b
    //return r

    return a + b
}
