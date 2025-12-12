package main.kotlin.operators

fun main(){

    /*
    Tabela verdade
     */

    println("Logic Operator AND")
    println("T and T = ${true && true} ")
    println("T and F = ${true && false} ")
    println("F and T = ${false && true} ")
    println("F and F = ${false && false} ")

    println("Logic Operator OR")
    println("T OR T = ${true || true} ")
    println("T OR F = ${true || false} ")
    println("F OR T = ${false || true} ")
    println("F OR F = ${false || false} ")

    println("Logic Operator NOT")
    println("NOT F ${!false}")
    println("NOT T ${!true}")

}