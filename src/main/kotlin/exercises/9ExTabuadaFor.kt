package main.kotlin.exercises

fun main(){

    println("Digite um Numero:")
    val n = readln().toInt()

    for (i in 1 until 11){
        println("$n * $i = ${n * i}")
    }


}