package problems

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 */

// 21. Merge Two Sorted Lists
class MergeTwoSortedLists {
    /**
     * Example:
     * var li = ListNode(5)
     * var v = li.`val`
     * Definition for singly-linked list.
     * class ListNode(var `val`: Int) {
     *     var next: ListNode? = null
     * }
     */
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var valor1 = list1
        var valor2 = list2

        val result = ListNode(0)
        var aux = result


        while(valor1 != null && valor2 != null) {
            //println("val1: ${valor1.`val`}\nval2: ${valor2.`val`}")
            if (valor1.`val` < valor2.`val`) {
                aux.next = ListNode(valor1.`val`)
                aux = aux.next!!
                valor1 = valor1.next
            } else if (valor1.`val` > valor2.`val`) {
                aux.next = ListNode(valor2.`val`)
                aux = aux.next!!
                valor2 = valor2.next
            } else {
                aux.next = ListNode(valor1.`val`)
                aux = aux.next!!
                aux.next = ListNode(valor2.`val`)
                aux = aux.next!!
                valor1 = valor1.next
                valor2 = valor2.next
            }
//            println("aux: ${aux.`val`}\n")
//            println("result: ${result.next?.`val`}\n")
        }
        if (valor1 == null) {
            aux.next = valor2
        } else {
            aux.next = valor1
        }

        return result.next
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

/**
 * Example 1:
 *
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 *
 * Example 2:
 *
 * Input: list1 = [], list2 = []
 * Output: []
 *
 * Example 3:
 *
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 *
 */
