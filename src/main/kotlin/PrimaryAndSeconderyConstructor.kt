fun main() {
    val car1 = Car("BMW", "Diesel", 4000000, 4)
    println(car1.name)
    val car2 = Car("Audi", 4500000)
    println(car2.name)
    println(car2.tyre)
    println(car2.type)
    println(car2.price)
}

class Car(val name: String, val type: String, val price: Long, val tyre: Int) {
    init {
        println("$name has been created")
    }

    //This is a secondary constructor
    constructor(nameParam: String, priceParam: Long) :
            this(nameParam, "Diesel", priceParam, 4)
}