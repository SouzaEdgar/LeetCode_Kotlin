package problems

/**
 * Given two strings needle and haystack,
 *  return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

// 28. Find the Index of the First Occurrence in a String
class FindIndexFirstOccurrence {
    fun findIndexFirsOccurrence(haystack: String, needle: String): Int {
        //return haystack.indexOf(needle)
        var index = 0

        if (needle in haystack) {
            for (x in 0..(haystack.length - needle.length)) {
                if (haystack[x] == needle[0]) {
                    for (y in 0..<needle.length) {
                        if (haystack[x+y] != needle[y]) break
                        if (y == needle.length-1) return index
                    }
                }
                index++
            }
        }
        return -1
    }
}

/**
 * Example 1:
 *
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 *
 * Example 2:
 *
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 *
 *
 *
 * Constraints:
 *
 *     1 <= haystack.length, needle.length <= 104
 *     haystack and needle consist of only lowercase English characters.
 *
 */
