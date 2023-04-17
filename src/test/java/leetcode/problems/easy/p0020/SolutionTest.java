package leetcode.problems.easy.p0020;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// https://leetcode.com/problems/valid-parentheses
@DisplayName("Leetcode Problem #20. Valid Parentheses")
class SolutionTest {

  @Test
  @DisplayName("Input: \"()\". Should return: true")
  void isValid1() {
    String input = "()";
    boolean result = new Solution().isValid(input);

    assertTrue(result);
  }

  @Test
  @DisplayName("Input: \"(])\". Should return: false")
  void isValid2() {
    String input = "(])";
    boolean result = new Solution().isValid(input);

    assertFalse(result);
  }

  @Test
  @DisplayName("Input: \"()[]{}\". Should return: true")
  void isValid3() {
    String input = "()[]{}";
    boolean result = new Solution().isValid(input);

    assertTrue(result);
  }

  @Test
  @DisplayName("Input: \"(]\". Should return: false")
  void isValid4() {
    String input = "(]";
    boolean result = new Solution().isValid(input);

    assertFalse(result);
  }
}

