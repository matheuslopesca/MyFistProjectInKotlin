package main.kotlin.classes
//Factory Method - Detalhar ber sobre uso e formas
fun main() {

    var car1 = Factory.newCar()
    var car2 = Factory.newCar()
    var car3 = Factory.newCar()

    println(Factory.instanceCounter)

}

object Factory {
    var instanceCounter = 0

    fun newCar(): Car {
        instanceCounter++
        return  Car()
    }
}

class Car