/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 */

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        var prefix = strs[0]

        if (strs.size > 1) {
            prefix = ""
            for (x in strs[0].toList().indices) {
                try {
                    val aux = strs.filter { it[x] == strs[0].toList()[x] }
                    if (aux == strs.toList()) {
                        prefix += strs[0].toList()[x]
                    } else {
                        break
                    }
                } catch (e: Exception) {}
            }
        }

        return prefix
    }
}

/**
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 *
 * Constraints:
 *
 *     1 <= strs.length <= 200
 *     0 <= strs[i].length <= 200
 *     strs[i] consists of only lowercase English letters if it is non-empty.
 *
 */
