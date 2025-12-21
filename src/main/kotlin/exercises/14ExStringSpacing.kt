package main.kotlin.exercises

fun main() {

    println(spacingString("love"))
    println(spacingString("agua", true))
}

private fun spacingString (str: String, upper: Boolean = false): String {
    var r = ""

    for ( c in str) {
        r += "$c "
    }

    if (upper == true) return r.trim().uppercase() else return r.trim()

}