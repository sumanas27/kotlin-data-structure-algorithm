package main.kotlin

import main.kotlin.dsalgoleetcode.LongestSubstring
import main.kotlin.dsalgoleetcode.TwoSum

fun main() {
    println("What's your name?")
    val name = readln()
    println("Hello, $name!")

    // Calling Two Sum class
    val twoSum = TwoSum()
    val result = twoSum.twoSum(nums = intArrayOf(1, 2, 3, 4, 5), target = 9)

    // Calling Longest Substring
    val longestSubstring = LongestSubstring()
    val lsResult = longestSubstring.lengthOfLongestSubstring(s = "abcabcbbb")

    println("Indices: ${result.joinToString(",")}")
    println("Longest Substring : $lsResult")
}