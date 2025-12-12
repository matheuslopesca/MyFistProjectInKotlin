package main.kotlin.exercises

import kotlin.math.truncate

fun main(){

    print("Enter a decimal value:")
    val d1 = readln().toDouble()
    //val d1Round = truncate(d1)
    val d1Round = d1.toInt()

    println("Your decimal is $d1Round and the decimal is $d1 .")


}