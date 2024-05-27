package leetcode.problems.easy.p0344;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// https://leetcode.com/problems/reverse-string/
@DisplayName("LeetCode Problem #344. Reverse String")
class SolutionTest {

  @Test
  @DisplayName("Input: s = [\"h\",\"e\",\"l\",\"l\",\"o\"] Output: [\"o\",\"l\",\"l\",\"e\",\"h\"]")
  void reverseString1() {
    char[] s = {'h', 'e', 'l', 'l', 'o'};
    char[] expected = {'o', 'l', 'l', 'e', 'h'};
    new Solution().reverseString(s);
    assertArrayEquals(expected, s);
  }

  @Test
  @DisplayName("Input: s = [\"H\",\"a\",\"n\",\"n\",\"a\",\"h\"] Output: [\"h\",\"a\",\"n\",\"n\",\"a\",\"H\"]")
  void reverseString2() {
    char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
    char[] expected = {'h', 'a', 'n', 'n', 'a', 'H'};
    new Solution().reverseString(s);
    assertArrayEquals(expected, s);
  }
}