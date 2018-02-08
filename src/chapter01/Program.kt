package chapter01

import java.util.*

var name = "Kotlin Demo"
val CONSTANT = "This a just like final in java"
var principal = 1000
var leftShiftValue = 123456
var rightShiftValue = 123456

fun main(args: Array<String>) {
    println("Hello world!")
    name = "var in kotlin is mutable"
    println(name)
    println(CONSTANT)

//  Bitwise operators
    println("Converting integer to double: " + principal.toLong())
    var leftShiftResult = leftShiftValue shl 2
    println("Left shifting value of leftShiftValue from $leftShiftValue to $leftShiftResult")
    var rightShiftResult = rightShiftValue shr 2
    println("Left shifting value of leftShiftValue from $rightShiftValue to $rightShiftResult")


//    Booleans

    val x = 1
    val y = 2
    val z = 2

    val isTrue = x < y && x < z
    println("The value of this exp x < y && x < z is $isTrue")

//    Arrays

    val array = arrayOf(1, 2, 3)
    println("Size of Array is ${array.size}")
//    creating array from an initial size and function

    val arrayWithFixedSizeFunction = Array(10, { k -> k * k })

    println("Elements of arrayWithFixedSizeFunction is ${Arrays.toString(arrayWithFixedSizeFunction)}")

//    Ranges

    val aToz = "a".."z"
    val oneToNine = 1..9

    val isExist = "c" in aToz

    println("Printing the value of var $aToz")
    println(" In range from A to Z, c is $isExist")

    var noOfLoop = 0
    while (noOfLoop <=10){
        println("Hello while loop $noOfLoop")
        noOfLoop++
    }



}

