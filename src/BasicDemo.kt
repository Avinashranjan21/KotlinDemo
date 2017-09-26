/**
 * Created by avinash.ranjan on 26/09/17.
 */


// Main function in kotlin
fun main(args: Array<String>) {
    println("Hello world in Kotlin")
    println("The value of addition of two number is ${add(2, 2)}")
    println("The value of addition of two number with single line function is ${sum(4, 4)}")
    println(printSum(5,10))
    println(printSumVoid(5,10))
}


// Function in kotlin with return type

fun add(a: Int, b: Int): Int {
    return a + b
}

// Function in kotlin with return type
fun sum(a: Int, b: Int) = a + b

// Function returning no meaningful value
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

// unit removed from return type
fun printSumVoid(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}
