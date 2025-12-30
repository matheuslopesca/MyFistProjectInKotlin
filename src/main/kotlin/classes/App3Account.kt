package main.kotlin.classes

fun main() {
    val a1 = Account("1234-5", "João")
    val a2 = Account("4444-5", "Maria")

    a1.deposit(2000.0)
    a2.deposit(150.0)

    a1.print()
    a2.print()


}