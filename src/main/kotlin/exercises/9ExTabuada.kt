package main.kotlin.exercises

fun main(){


    println("Digite um Numero:")
    val n = readln().toInt()

    var cont:Int = 1

    while(cont <= 10){
        println("$n * $cont = ${n * cont}")
        cont++
    }


}