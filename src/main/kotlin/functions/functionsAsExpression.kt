package main.kotlin.functions

fun main() {

    println(multiply(5, 2))
    println(multiply2(5, 2))

}

private fun multiply(a: Int, b: Int): Int {
    return a * b;
}

private fun multiply2(a: Int, b: Int) = a * b