package main.kotlin.classes

fun main() {
    val a1 = Account()
    val a2 = Account()

    /*a1.balance = 100.0
    a2.balance = 1_000_000.0
    println(a1.balance)
    println(a2.balance)*/

    a1.deposit(2000.0)
    a2.deposit(150.0)

   //println(a1.balance)
    //println(a2.balance)


}