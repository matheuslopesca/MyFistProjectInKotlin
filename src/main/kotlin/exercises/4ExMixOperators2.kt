package main.kotlin.exercises

fun main(){

    /*
    * Order do solve
    *  arithmetcs
    *  relational
    *  logical
     */
    val exp = !(2 * 4 >= 16 / 2 && 5 == 4 + 1)
    /*
    * !(2 * 4 >= 16 / 2 && 5 == 4 + 1)
    * !(8 >= 8 && 5 == 5)
    * !(true && true)
    * !true
    * false
     */

    println(exp)
}