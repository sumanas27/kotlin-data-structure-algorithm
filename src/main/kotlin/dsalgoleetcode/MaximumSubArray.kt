package main.kotlin.dsalgoleetcode

import kotlin.math.max

/**
 * Problem Statement:
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * that has the largest sum, and return the sum.
 *
 * Input
 * val nums = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
 *
 * Output
 * 6
 *
 * Explanation
 * The subarray [4, -1, 2, 1] has the largest sum = 6.
 * */

class MaximumSubArray {

    fun maximumSubArray(input: IntArray): Int{

        var currentSum = input[0]
        var maxSum = input[0]

        for (element in input){
            currentSum = currentSum + element
            maxSum = max(maxSum, currentSum)
            currentSum = max(currentSum, 0)
        }
        return maxSum
    }
}

fun main(){

    val maximumSubArray = MaximumSubArray()
    println(maximumSubArray.maximumSubArray(intArrayOf(2,3,-8,7,-1, 2,3)))
}