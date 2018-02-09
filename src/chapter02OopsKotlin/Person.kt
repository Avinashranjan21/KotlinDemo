package chapter02OopsKotlin

import chapter01KotlinBasics.printName
import showFirstCharacter

class Person constructor(val firstName : String,val lastName : String){}

fun main(args: Array<String>) {
    val person1 = Person("Avinash","Pandey")
    val person2 = Person("Avinash","Ranjan")

    println("My name is ${person1.firstName} ${person1.lastName}")
    println("My name is ${person2.firstName} ${person2.lastName}")

    var student = Student("Avinash","Pandey",28)
    println("My name is ${student.getName()} and my age is ${student.getAge()}")

    showFirstCharacter("Avinash Pandey")
    printName()

}

class Student(firstName: String, lastName: String, howOld: Int?) {
    private val name: String
    private val age: Int?

    init {
        println("init of Student class is called")
        this.name = "$firstName $lastName"
        this.age = howOld
    }

    fun getName():String = this.name

    fun getAge():Int? = this.age
}