package main.kotlin.dsalgoleetcode

/**
 * Linked List Cycle
 *
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * There is a cycle in a linked list if there is some node in the list that can be reached
 * again by continuously following the next pointer. Internally, pos is used to denote the
 * index of the node that tail's next pointer is connected to. Note that pos is not passed
 * as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to
 * the 1st node (0-indexed).
 * */

class LinkedListCycleDetection {

    /**
     * Example:
     * var li = ListNode(5)
     * var v = li.`val`
     * Definition for singly-linked list.
     * class ListNode(var `val`: Int) {
     *     var next: ListNode? = null
     * }
     */

    fun hasCycle(head: ListNode?): Boolean {
        var slow = head
        var fast = head
        while (fast != null && fast.next != null) {
            slow = slow?.next
            fast = fast.next?.next
            if (slow == fast)
                return true
        }
        return false
    }
}


class ListNode(var `val`: Int) {
    var next: ListNode? = null
}