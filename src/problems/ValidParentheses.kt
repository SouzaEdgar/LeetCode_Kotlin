package problems

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 *     Open brackets must be closed by the same type of brackets.
 *     Open brackets must be closed in the correct order.
 *     Every close bracket has a corresponding open bracket of the same type.
 *
 */

// 20. Valid Parentheses
class ValidParentheses {
    fun isValid(s: String): Boolean {
        val parType = mapOf(
            '(' to 1,
            '{' to 2,
            '[' to 3,
            ')' to 1,
            '}' to 2,
            ']' to 3
        )

        val open = setOf('(', '{', '[')

        val opened = mutableListOf<Char>()

        for (char in s) {
            if (char in open) {
                opened.add(char)
            }
            else {
                if (parType[char] == (if (opened.isEmpty()) 4 else parType[opened[opened.indices.last]])) {
                    opened.removeLast()
                }
                else
                    return false
            }
        }

        return opened.isEmpty()
    }
}

/**
 * Example 1:
 *
 * Input: s = "()"
 *
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "()[]{}"
 *
 * Output: true
 *
 * Example 3:
 *
 * Input: s = "(]"
 *
 * Output: false
 *
 * Example 4:
 *
 * Input: s = "([])"
 *
 * Output: true
 *
 * Example 5:
 *
 * Input: s = "([)]"
 *
 * Output: false
 *
 */