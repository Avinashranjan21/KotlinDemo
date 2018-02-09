package chapter01KotlinBasics

val myName = "Avinash Pandey"

fun main(args: Array<String>) {
    println("This class is sample for Control flow in Kotlin")
    nameCheck()
    singleLineControlFlow("Avinash Pandey")
    guessNumber(0)
    guessNumber(1)
    guessNumber(2)
    guessNumber(3)
    guessNumber(4)
    guessNumber(4)
    guessNumber(6)
    guessNumber(10)

    whenWithoutArgument(10, 20)
    whenWithoutArgument(20, 10)
    whenWithoutArgument(20, 20)

}

fun nameCheck() {

    if (myName.startsWith("A")) {
        println("$myName is start with A")
    } else {
        println("$myName is not starting with A")
    }
}

fun singleLineControlFlow(name: String) {
    var isStartWith = if (myName == name) true else false
    println("The given name is $isStartWith")
}

// When statement

fun guessNumber(number: Int) {
    when (number) {
        0 -> println("number is 0")
        1 -> println("number is 1")
        2 -> println("number is 2")
        3, 4, 5, 6 -> println("number is 3,4,5,6")
        else -> println("number is waste")
    }
}

// When without argument

fun whenWithoutArgument(x: Int, y: Int) {
    when {
        x < y -> println("X is less than Y")
        x > y -> println("X is greater than Y")
        else -> println("X and Y both are equal")
    }
}
