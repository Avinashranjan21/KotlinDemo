package chapter01KotlinBasics

val myName = "Avinash Pandey"

fun main(args: Array<String>) {
    println("This class is sample for Control flow in Kotlin")
    nameCheck()
    singleLineControlFlow("Avinash Pandey")

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
