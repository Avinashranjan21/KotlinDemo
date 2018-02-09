package chapter01KotlinBasics

fun main(args: Array<String>) {
    isString("Avinash")
    isString(1234)
    smartCast("AvinashPandey")
    smartCast(88263456)
}

fun isString(any: Any) {
    if (any is String) {
        println("$any is String")
    } else {
        println("$any is other than String")
    }
}

fun smartCast(any: Any){
    if (any is String) println("$any string size is ${any.length}") else println("Any is of other type")
}