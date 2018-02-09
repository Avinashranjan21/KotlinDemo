package chapter01KotlinBasics

fun main(args: Array<String>) {

    try {
        var divide = 10/0
        println("10/0 is working")
    } catch (e: ArithmeticException) {
        println("10/0 will raise exception: ${e.message} ")
    }
}