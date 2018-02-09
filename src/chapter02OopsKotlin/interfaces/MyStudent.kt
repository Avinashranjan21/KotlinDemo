package chapter02OopsKotlin.interfaces

class MyStudent :Student{
    override val firstName: String
        get() = "Avinash"
    override val lastName: String
        get() = "Pandey"


}