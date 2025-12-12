package main.kotlin.exercises

fun main(){

    print("Digite um Valor numérico:")
    var valor = readln().toFloat()
    if (valor > 10){
        println("Ajustando valor")
        valor = 10F
    }
    valor = valor * valor
    // valor *= valor
    println("O Valor resultante é: ${valor}")

}