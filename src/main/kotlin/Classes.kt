fun main() {
    val ford : BuildCar = BuildCar("Ford A8", "Petrol", 46578)
    ford.createBrandName()
    ford.setFuelType()
    ford.setCarPrice()
}

class BuildCar(val name: String, val type: String, val price: Long) {
    fun createBrandName() {
        println("Car name has been added as $name")
    }

    fun setFuelType() {
        println("car fuel type has been set as $type")
    }

    fun setCarPrice() {
        println("Car price is set for $$price")
    }
}