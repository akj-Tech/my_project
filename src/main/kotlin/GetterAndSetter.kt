fun main() {
    val p1 = Person("", 24)
    println(p1.name)
}

class Person(name: String, age: Int) {
    var name: String = name
    set(value) {
        if(value.toString() != ""){
            field = value
        }else{
            println("name cant be empty")
        }
    }

    get(){
        return field.toString()
    }
    var age: Int = age


}