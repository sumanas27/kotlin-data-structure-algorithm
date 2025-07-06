package main.kotlin.dsalgoleetcode

/**
 *     val nums = listOf("apple", "banana", "apple", "orange", "banana", "apple")
 *     val k = 2
 * */


class TopKElements {

    fun topKFrequent(nums: List<String>, k: Int): List<String>{

        return nums.groupingBy { it }
            .eachCount() //{"apple" -> 3, "banana" -> 2, "orange" -> 1}
            .entries // [Map.Entry("apple" → 3), Map.Entry("banana" → 2), ...]
            .sortedByDescending { it.value } // ["apple" (3), "banana" (2), "orange" (1)]
            .take(2)
            .map { it.key } // ["apple", "banana"]
    }
}