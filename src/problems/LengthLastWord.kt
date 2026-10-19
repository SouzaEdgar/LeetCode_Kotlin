package problems

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 *
 * A word is a maximal substring consisting of non-space characters only.
 */

// 58. Length of Last Word
class LengthLastWord {
    fun lengthOfLastWord(s: String): Int {
        var count = 0
        var index = s.length - 1

        while (index >= 0) {
            if (s[index] != ' ') {
                count++
            }
            else if (count > 0) return count

            index--
        }
        return count
    }
}

/**
 * Example 1:
 *
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 *
 * Example 2:
 *
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 *
 * Example 3:
 *
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 *
 */
