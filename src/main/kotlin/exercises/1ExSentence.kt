package main.kotlin.exercises

import java.util.Scanner

fun main(){

    val scanner = Scanner(System.`in`)
    print("Enter your name:")
    val name = readln()
    print("Enter your age:")
    val age = scanner.nextInt()
    print("Enter your weight:")
    val weight = readln().toDouble()

    println()

    println("Your name is $name, you are $age years old and your weight $weight kgs.")

}