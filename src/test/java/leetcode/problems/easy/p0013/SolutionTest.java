package leetcode.problems.easy.p0013;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://leetcode.com/problems/roman-to-integer/
@DisplayName("Leetcode Problem #13. Roman to Integer")
class SolutionTest {

  @Test
  @DisplayName("Input: III. Should return: 3")
  void romanToInt1() {
    String input = "III";
    int expected = 3;
    int result = new Solution().romanToInt(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: IV. Should return: 4")
  void romanToInt2() {
    String input = "IV";
    int expected = 4;
    int result = new Solution().romanToInt(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: LVIII. Should return: 58")
  void romanToInt3() {
    String input = "LVIII";
    int expected = 58;
    int result = new Solution().romanToInt(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: MCMXCIV. Should return: 1994")
  void romanToInt4() {
    String input = "MCMXCIV";
    int expected = 1994;
    int result = new Solution().romanToInt(input);

    assertEquals(expected, result);
  }
}
