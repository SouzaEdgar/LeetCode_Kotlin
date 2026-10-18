import problems.FindIndexFirstOccurrence
import problems.ListNode
import problems.LongestCommonPrefix
import problems.MergeTwoSortedLists
import problems.PalindromeNumber
import problems.RomanToInteger
import problems.TwoSum
import problems.ValidParentheses

fun main() {
    //testTwoSum()
    //testPalindromeNumber()
    //testLongestCommonPrefix()
    //testFindIndexFirstOccurrence()
    //testRomanToInteger()
    //testValidParentheses()
    testMergeTwoSortedLists()
}

private fun testTwoSum() {
    val problem = TwoSum()

    val case1 = problem.twoSum(nums = intArrayOf(2,7,11,15), target = 9)
    val case2 = problem.twoSum(nums = intArrayOf(3,2,4), target = 6)
    val case3 = problem.twoSum(nums = intArrayOf(3,3), target = 6)
    val case4 = problem.twoSum(nums = intArrayOf(-1,-2,-3,-4,-5), target = -8)

    println(
        "${case1.contentToString()}\n" +
        "${case2.contentToString()}\n" +
        "${case3.contentToString()}\n" +
        case4.contentToString()
    )
}

private fun testPalindromeNumber() {
    val problem = PalindromeNumber()

    val case1 = problem.isPalindrome(x = 121)
    val case2 = problem.isPalindrome(x = -121)
    val case3 = problem.isPalindrome(x = 10)

    val test = problem.isPalindrome(x = 0)

    println(
        "$case1\n" +
        "$case2\n" +
        "$case3\n" +
        "$test"
    )
}

private fun testLongestCommonPrefix() {
    val problem = LongestCommonPrefix()

    val case1 = problem
        .longestCommonPrefix(arrayOf("flower","flow","flight"))
    val case2 = problem
        .longestCommonPrefix(arrayOf("dog","racecar","car"))
    val case3 = problem
        .longestCommonPrefix(arrayOf("A3","A4","a5"))
    val case4 = problem
        .longestCommonPrefix(arrayOf("B 3","B 4","B 5"))
    val case5 = problem
        .longestCommonPrefix(arrayOf("C  A","C  A","C  AB"))
    val case6 = problem
        .longestCommonPrefix(arrayOf("123123","12345","123"))
    val case7 = problem
        .longestCommonPrefix(arrayOf("oi","oiola"))
    val case8 = problem
        .longestCommonPrefix(arrayOf("oi","alo"))

    println(
        "$case1\n" +
        "$case2\n" +
        "$case3\n" +
        "$case4\n" +
        "$case5\n" +
        "$case6\n" +
        "$case7\n" +
        case8
    )
}

private fun testFindIndexFirstOccurrence() {
    val problem = FindIndexFirstOccurrence()

    val case1 = problem.findIndexFirsOccurrence("sadbutsad", "sad")
    val case2 = problem.findIndexFirsOccurrence("leetcode", "leeto")
    val case3 = problem.findIndexFirsOccurrence("mississippi", "issip")
    val case4 = problem.findIndexFirsOccurrence("mississippi", "sipp")
    val case5 = problem.findIndexFirsOccurrence("a", "a")

    println(
        "$case1\n" +
        "$case2\n" +
        "$case3\n" +
        "$case4\n" +
        "$case5"
    )
}

private fun testRomanToInteger() {
    val problem = RomanToInteger()

    val case1 = problem.romanToInt("III")
    val case2 = problem.romanToInt("LVIII")
    val case3 = problem.romanToInt("MCMXCIV")

    println(
        "$case1\n" +
        "$case2\n" +
        "$case3"
    )
}

private fun testValidParentheses() {
    val problem = ValidParentheses()

    val case1 = problem.isValid("()")
    val case2 = problem.isValid("()[]{}")
    val case3 = problem.isValid("(]")
    val case4 = problem.isValid("([])")
    val case5 = problem.isValid("([)]")
    val case6 = problem.isValid("[")
    val case7 = problem.isValid(")")
    val case8 = problem.isValid("{{")

    println(
        "$case1\n" +
        "$case2\n" +
        "$case3\n" +
        "$case4\n" +
        "$case5\n" +
        "$case6\n" +
        "$case7\n" +
        "$case8"
    )
}

private fun testMergeTwoSortedLists() {
    val problem = MergeTwoSortedLists()

    val list1 = ListNode(1)
    list1.next = ListNode(2)
    list1.next?.next = ListNode(4)

    val list2 = ListNode(1)
    list2.next = ListNode(3)
    list2.next?.next = ListNode(4)

    val case1 = problem.mergeTwoLists(list1, list2)

    println("$case1")
}
