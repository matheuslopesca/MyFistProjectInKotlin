package main.kotlin.variables

import java.util.Scanner

fun main(){

//    print("Digite o primeiro numero:")
//    val n1 = readln().toInt()
//    print("Digite o segundo numero:")
//    val n2 = readln().toInt()
//
//    println("Result: ${n1 + n2}")

    val scanner = Scanner(System.`in`)
    print("First number:")
    val n1 = scanner.nextInt()
    print("Second number:")
    val n2 = scanner.nextInt()

    println("Result: ${n1 + n2}")
}