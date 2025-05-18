package main.kotlin

import main.kotlin.dsalgoleetcode.LinkedListCycleDetection
import main.kotlin.dsalgoleetcode.ListNode
import main.kotlin.dsalgoleetcode.LongestSubstring
import main.kotlin.dsalgoleetcode.TwoSum

fun main() {
    println("What's your name?")
    val name = readln()
    println("Hello, $name!")

    // Calling Two Sum class
    val twoSum = TwoSum()
    val result = twoSum.twoSum(nums = intArrayOf(1, 2, 3, 4, 5), target = 9)
    println("Indices: ${result.joinToString(",")}")

    // Calling Longest Substring
    val longestSubstring = LongestSubstring()
    val lsResult = longestSubstring.lengthOfLongestSubstring(s = "abcabcbbb")
    println("Longest Substring : $lsResult")

    // Calling LinkedList Cycle Detection
    val linkedListCycleDetection = LinkedListCycleDetection()
    val node1 = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(3)
    node1.next = node2
    node2.next = node3
    node3.next = node1 // cycle back to x
    val llcdResult = linkedListCycleDetection.hasCycle(node1)
    println("Has cycle $llcdResult")
}