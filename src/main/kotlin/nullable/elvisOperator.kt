package main.kotlin.nullable

fun main(){

    val value: Int? = 15
    //val value2 = if (value != null) value else 0
    val value2 = value ?: 0
    println(value2)

}