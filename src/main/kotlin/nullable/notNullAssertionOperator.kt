package main.kotlin.nullable

fun main(){

    val s: String? = null
    //val s: String? = "abcde"
    val i = s!!.reversed()

    println(i)

}