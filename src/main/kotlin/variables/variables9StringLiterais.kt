package main.kotlin.variables

fun main() {
    /*
    O rato roeu
    a roupa do
    rei de "Roma"
     */

    val s1 = "O rato roeu\na \$roupa do\nrei de \"Roma\"."
    println(s1)

    println()
    //row string
    val s2 = """
       O rato roeu
         a roupa do 
           rei de "Roma".
    """.trimIndent()
    println(s2)

    println()
    //row string
    val s3 = """
       |O rato roeu
       |  a roupa do 
       |    rei de "Roma".
    """.trimMargin()
    println(s3)
}