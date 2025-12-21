package main.kotlin.exercises

fun main() {
    print("Digite a Idade: ")
    val age = readLine()!!.toInt()
    val newAge = calculateDogAge(age)
    println("A ideade é $newAge")
}

private fun calculateDogAge (dAge: Int): Int {
    return dAge * 7
}