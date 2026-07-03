//      1.Two Sum
class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var result = intArrayOf()

        for (i in 0 .. nums.size-1) {
//            println("indice i: $i")
            for (j in i+1 .. nums.size-1) {
//                println("indice j: $j")
                if (nums[i] + nums[j] == target) {
                    result = intArrayOf(i, j)
                    break
                }
            }
        }
        return result
    }
}
