package main.kotlin.exercises

import kotlin.random.Random
import kotlin.random.nextInt

fun main(){

    val r  = (1..20).random()
    //val secret = Random.nextInt(0, 101)
    var n = 0

    //First Form
    /*while (r != n){
        print("Digite um numero:")
        n = readln().toInt()
        if (r == n){
            println("Você Acertou")
        } else if ( n < r){
            println("Numero Digitado é menor que aleatório")
        } else {
            println("Numero digitado é maior que o aleatório")
        }
    }*/

    // Second Form
    while (r != n){
        print("Digite um numero:")
        n = readln().toInt()
        when{
            n < r -> println("Numero menor que o aleatório")
            n > r -> println("Numero maior que o aleatorio")
            else -> println("Voce acertou o numero que era $r")
        }
    }
}