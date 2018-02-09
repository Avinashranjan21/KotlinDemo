package chapter02OopsKotlin.interfaces

interface Student {

    val firstName: String
    val lastName: String

    fun getName(): String{
        return "$firstName $lastName"
    }
}