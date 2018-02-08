package chapter01

fun main(args: Array<String>) {
    val aToZ = "a".."z"

    val list = listOf(1,2,3,4,5)
    for (v in list){
        println("Value of v is $v")
    }

    println("****************************")

    for (n in 1..10){
        println("Loop Count is $n")
    }

    println("Loop in string variable")
    val string = "print my characters"
    for (char in string) {
        println(char)
    }

    val arrayValue = Array(10, { k -> k * k })
    for (a in arrayValue.indices){
        println("Looping on Array and value is $a")
    }


}