package main.kotlin.exercises

fun main() {

    var p1 = Person("Matheus")


    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.drinkWater()
    p1.walk()
    p1.printInfo()


    var p2 = Person("Thiago", 6000.0)

    p2.walk()
    p2.walk()
    p2.walk()
    p2.walk()
    p2.walk()
    p2.walk()
    p2.walk()
    p2.drinkWater()
    p2.walk()
    p2.walk()
    p2.walk()
    p2.walk()
    p2.walk()
    p2.walk()
    p2.walk()
    p2.drinkWater()
    p2.walk()
    p2.walk()
    p2.walk()
    p2.walk()
    p2.walk()
    p2.walk()
    p2.walk()
    p2.printInfo()

}

private class Person(val Name: String, val maxDistance: Double = 5000.0) {

    var actualDistance: Double = 0.0
    var totalDistance: Double = 0.0
    var needWater: Boolean = false

    fun walk() {
        if (actualDistance < maxDistance ) {
            actualDistance += 1000.0
            totalDistance += 1000.0
        } else {
            needWater = true
            println("Distance is too large, You need to drink water")
        }
    }

    fun drinkWater() {
        needWater = false
        actualDistance -= actualDistance
    }

    fun printInfo(){
        println("Name: $Name; Distance: $totalDistance: NeedWater: $needWater")
    }

}