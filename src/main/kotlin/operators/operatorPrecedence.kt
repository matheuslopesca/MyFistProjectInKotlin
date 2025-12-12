package main.kotlin.operators

fun main(){

    val exp = 5 + 4 - 3 * 2 * (1 + 1) / 3
    /*
    * () parenteses primeiro
    * * / depende da ordem, começa pela esqueda
    * + - depende da ordem, começa pela esqueda
    * 5 + 4 - 3 * 2 * 2 / 3
    * 5 + 4 - 6 * 2 / 3
    * 5 + 4 - 12 / 3
    * 5 + 4 - 4
    * 9 - 4
    * 5
     */
    println(exp)

    val exp2 = true && false || true && !false
    /*
    * true && false || true && true
    * false || true && true
    * false || true
    * true
     */
    println(exp2)

}