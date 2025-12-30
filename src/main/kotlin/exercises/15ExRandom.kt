package main.kotlin.exercises

fun main(){
/*
    print("Digite o Primeiro valor do range:")
    val v1 = readln()
    print("Digite o Segundo valor do range:")
    val v2 = readln()
*/
    val random = CharGenerator('A', 'Z')

    println("O Caractere gerado é ${random.next()}")
}

class CharGenerator(val min: Char, val max: Char) {
/*
    fun next(): Char {
        return (min .. max).random()
    }
*/
    fun next() = (min .. max).random()
}