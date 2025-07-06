package main.kotlin.zalando

/**
 * Problem Statement:
 * You are given an array of integers, where each element represents a product value.
 * Return a new array result[] such that:
 *
 * result[i] is equal to the product of all elements in the original array except arr[i].
 *
 * [1, 2, 3, 4] => [24, 12, 8, 6]
 * */

class FetchProductExcludingCurrent {

    fun fetchProduct(input: List<Int>): List<Int> {

        var currentProduct = 1

        val result = mutableListOf<Int>()

        // for((element, index) in input.withIndex()){
        //     var currentProduct = element * input[index + 1] *
        // }
        for (i in 0..input.size - 1) {
            for (j in 0..input.size - 1) {
                if (i == j) continue
                currentProduct = currentProduct * input[j]
            }
            result.add(currentProduct)
            currentProduct = 1
        }

        println(result)
        return result
    }
}