package leetcode.problems.easy.p0009;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// https://leetcode.com/problems/palindrome-number/
@DisplayName("Leetcode Problem #9. Palindrome Number")
class SolutionTest {

  @Test
  @DisplayName("Input: 121. Should return: true")
  void isPalindrome1() {
    int input = 121;
    boolean result = new Solution().isPalindrome(input);

    assertTrue(result);
  }

  @Test
  @DisplayName("Input: 3. Should return: true")
  void isPalindrome2() {
    int input = 3;
    boolean result = new Solution().isPalindrome(input);

    assertTrue(result);
  }

  @Test
  @DisplayName("Input: -121. Should return: false")
  void isPalindrome3() {
    int input = -121;
    boolean result = new Solution().isPalindrome(input);

    assertFalse(result);
  }

  @Test
  @DisplayName("Input: 10. Should return: false")
  void isPalindrome4() {
    int input = 10;
    boolean result = new Solution().isPalindrome(input);

    assertFalse(result);
  }

  @Test
  @DisplayName("Input: 1010. Should return: false")
  void isPalindrome5() {
    int input = 1010;
    boolean result = new Solution().isPalindrome(input);

    assertFalse(result);
  }
}