package main.kotlin.repetition

fun main() {

    for ( i in 0 .. 50 ){

        if (i == 20) {
            break
        }

        print("$i ")

    }

    print("Fim")
}