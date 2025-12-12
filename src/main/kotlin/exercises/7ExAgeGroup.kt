package main.kotlin.exercises

fun main() {

    var stage: String
    print("Digite uma Idade:")
    var age = readln().toInt()

    if (age >= 0 && age <= 12 ) {
        stage = "Criança"
    } else if (age >= 13  && age <= 17) {
        stage = "Adolecente"
    } else if (age >= 18 && age <= 65) {
        stage = "Adulto"
    } else {
        stage = "Serino"
    }

    println("O Estágio da vida é ${stage}")
}