fun main() {
  var arr  : Array<String> = arrayOf("One", "Two", "three")

    //to print the normal element of the array we can write the code as below
    for (i in arr)
    {
        println("$i")
    }

    //if we need to print the index as well as the element we have to write the code as below
    for((i,e) in arr.withIndex()){
        println("index is $i & the element is $e ")
    }
}