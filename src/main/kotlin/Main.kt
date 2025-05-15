package main.kotlin

import TwoSum

fun main() {
    println("What's your name?")
    val name = readln()
    println("Hello, $name!")

    // Calling Two Sum class
    val obj = TwoSum()
    val result = obj.twoSum(nums = intArrayOf(1,2,3,4,5), target = 9)

    println("Indices: ${result.joinToString(",")}")
}