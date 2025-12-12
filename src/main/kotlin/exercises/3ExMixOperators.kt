package main.kotlin.exercises

import java.util.Scanner

fun main(){

    /*
    * Order do solve
    *  arithmetcs
    *  relational
    *  logical
     */
    val exp = (5 + 3) * 2 < 30 / 2 || !(5 - 1 <= 8 % 3)
    /*
    * (5 + 3) * 2 < 30 / 2 || !(5 - 1 <= 8 % 3)
    * 8 * 2 < 30 / 2 || !false
    * 16 < 30 / 2 || true
    * 16 < 15 || true
    * false || true
    * true
     */

    println(exp)
}