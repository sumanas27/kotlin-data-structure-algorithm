class TwoSum {

/*
* Time Complexity O(n)
* Space Complexity O(n)
*
* Step 1 : Declare a Map of Integers which will be used for comparison
* Step 2 : Run through the array with index
* Step 3 : Substract the current element from target sum and store it
* Step 4 : Check if the complement present in the map
* Step 5 : If present then create and return an array of Integers with the index
*          of the current element and fetched value from map with the complement key
* Step 6 : Otherwise set the map with current element as key and current index
*          as value
* Step 7 : Return an empty array by default
* */

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = mutableMapOf<Int, Int>()

        // using array with index as index and value both are required for computation
        for((index, element) in nums.withIndex()){
            val complement = target - element
            if( complement in seen )
                return intArrayOf(seen.get(complement)!!, index)
            // setting the map with the current index
            seen[element] = index
        }
        return intArrayOf()
    }
}