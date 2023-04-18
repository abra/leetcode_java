package leetcode.problems.medium.p0007;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://leetcode.com/problems/reverse-integer/
@DisplayName("Leetcode Problem #7. Reverse Integer")
class SolutionTest {

  @Test
  @DisplayName("Reverse 123. Should return 321")
  void reverseInteger1() {
    int input = 123;
    int expected = 321;
    int result = new Solution().reverse(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Reverse -123. Should return -321")
  void reverseInteger2() {
    int input = -123;
    int expected = -321;
    int result = new Solution().reverse(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Reverse 120. Should return 21")
  void reverseInteger3() {
    int input = 120;
    int expected = 21;
    int result = new Solution().reverse(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Reverse 1010. Should return 101")
  void reverseInteger4() {
    int input = 1010;
    int expected = 101;
    int result = new Solution().reverse(input);

    assertEquals(expected, result);
  }
}