fun main() {
    val sum = add(a = 10, 21)
    println("The Sum Of 10  & 20 is $sum")
    println("The sum of 10 & 20 is ${evenOrOdd(sum)}")
    printMsgForMe()

/*
* This is how we can assign a function into a variable
*
* */

    val doSum = ::add
    println(doSum(15, 15))

}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun evenOrOdd(num1: Int): String {
    return if (num1 % 2 == 0) "even" else "odd"
}

//*
// This is a function which will take arguments and perform certain operations and also if no argument passed
// it will use its default value which is mentioned while implementation ( This is called as default
// constructor)
// */
fun printMsgForMe(count: Int = 2) {
    for (i in 1..count) {
        println("Hi Ayan , i am count $i")
    }
}

