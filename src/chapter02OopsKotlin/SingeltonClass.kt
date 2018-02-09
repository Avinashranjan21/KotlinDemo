package chapter02OopsKotlin

object Singelton {
    private var count = 0
    fun doSomething(): Unit {
        println("Calling a doSomething (${++count} call/-s in total)")
    }
}