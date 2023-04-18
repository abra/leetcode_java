package leetcode.problems.hard.p0032;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://leetcode.com/problems/longest-valid-parentheses/
@DisplayName("Leetcode Problem #32. Longest Valid Parentheses")
class SolutionTest {

  @Test
  @DisplayName("Input: \"(()\". Should return: 2")
  void longestValidParentheses1() {
    String input = "(()";
    int expected = 2;
    int result = new Solution().longestValidParentheses(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: \")()())\". Should return: 4")
  void longestValidParentheses2() {
    String input = ")()())";
    int expected = 4;
    int result = new Solution().longestValidParentheses(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: \"(((()()))())(()()(()(\". Should return: 12")
  void longestValidParentheses3() {
    String input = "(((()()))())(()()(()(";
    int expected = 12;
    int result = new Solution().longestValidParentheses(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: \"())(()(\". Should return: 2")
  void longestValidParentheses4() {
    String input = "())(()(";
    int expected = 2;
    int result = new Solution().longestValidParentheses(input);

    assertEquals(expected, result);
  }
}