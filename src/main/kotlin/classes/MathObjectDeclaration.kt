package main.kotlin.classes
//object declarations
fun main() {

    println(Math2.sum(20, 10))

    println(Math2.subtract(20, 10))
}

object Math2 {

    fun subtract(a: Int, b: Int) = a - b

        fun sum(a: Int, b: Int) = a + b
}