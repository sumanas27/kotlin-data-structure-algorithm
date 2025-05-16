package main.kotlin.dsalgoleetcode

/**
 * Time Complexity O(n)
 * Longest Substring Without Repeating Characters
 * Given a string s, find the length of the longest substring without duplicate characters.
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

class LongestSubstring {

    fun lengthOfLongestSubstring(s: String): Int {
        val seen = mutableMapOf<Char,Int>()
        var start = 0
        var maxLength = 0

        for((index, element) in s.withIndex()){
            if( element in seen && seen[element]!! >= start){
                start = seen[element]!! + 1
            }
            seen[element] = index
            maxLength = maxOf(maxLength, index - start + 1)
        }
        return maxLength
    }
}