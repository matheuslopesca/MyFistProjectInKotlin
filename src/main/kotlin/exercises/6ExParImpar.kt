package main.kotlin.exercises

fun main(){

    var type: String
    print("Digite um Valor numérico:")
    var v = readln().toInt()
    if (v % 2 == 0){
        type = "Par"
    } else {
        type = "Impar"
    }

    println("Numero ${v} é ${type}")

}