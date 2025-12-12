package main.kotlin.exercises

/**
 * EXERCÍCIO
 *---------
 *
 * Implemente uma calculadora capaz de executar as 4 operações básicas e que recebe os dados via teclado.
 * Três informações devem ser passadas: o primeiro operando, a operação matemática e o segundo operando.
 * Por exemplo:
 * > 20
 * > +
 *> 4
 * > Resultado: 24
**/

fun main() {

    print("Primeiro Valor:")
    var v1 = readln().toFloat()
    print("Operador: ")
    var opr = readln()
    print("Segundo Valor:")
    var v2 = readln().toFloat()

    val result = when (opr) {
        "*" -> v1 * v2
        "/" -> v1 / v2
        "+" -> v1 + v2
        "-" -> v1 - v2
        else -> "Operador Invalido"
    }

    println("Resultado: $result")


}