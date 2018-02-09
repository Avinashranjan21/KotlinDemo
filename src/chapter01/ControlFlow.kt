package chapter01

val myName = "Avinash Pandey"

fun main(args: Array<String>) {
    println("This class is sample for Control flow in Kotlin")
    nameCheck()
    singleLineControlFlow("Avinash Pandey")
    isString("Avinash")
    isString(1234)

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

fun isString(any: Any) {
    if (any is String) {
        println("$any is String")
    } else {
        println("$any is other than String")
    }
}