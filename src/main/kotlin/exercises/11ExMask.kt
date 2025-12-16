package main.kotlin.exercises

fun main(){

    print("Enter Your Password:")
    var password: String? = readln()

    if (password == null) password == "1234"

    val passmask: String? = password?.replace(password, "****")
    println(passmask)



}