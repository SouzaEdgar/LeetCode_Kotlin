package problems

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 */

// 35. Search Insert Position
class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
//        for (index in nums.indices) {
//            if (nums[index] >= target) return index
//        }
//        return nums.size
        val index = nums.binarySearch(target)
        return if (index >= 0) index else (-index -1)
    }
}

/**
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 *
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 *
 * Example 3:
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 *
 */
