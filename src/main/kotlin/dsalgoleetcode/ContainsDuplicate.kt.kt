package main.kotlin.dsalgoleetcode

/**
 * Contains Duplicate
 * Given an integer array nums, return true if any value appears at least twice in the
 * array, and return false if every element is distinct.
 *
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * Explanation:
 * The element 1 occurs at the indices 0 and 3.
 * */

class `ContainsDuplicate.kt` {

    fun containsDuplicate(nums: IntArray): Boolean {

        val seen = mutableSetOf<Int>()
        for(i in nums){
            if( i in seen)
                return true
            seen.add(i)
        }
        return false
    }
}