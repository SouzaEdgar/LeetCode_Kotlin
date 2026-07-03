fun main() {
    testTwoSum()
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
