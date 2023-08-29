package leetcode.problems.easy.p0125;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// https://leetcode.com/problems/valid-palindrome/description/
@DisplayName("Leetcode Problem #125. Valid Palindrome")
class SolutionTest {

  @Test
  @DisplayName("Input: 'A man, a plan, a canal: Panama'. Should return: true")
  void isPalindrome1() {
    String input = "A man, a plan, a canal: Panama";
    boolean expected = true;
    boolean result = new Solution().isPalindrome(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: 'race a car'. Should return: false")
  void isPalindrome2() {
    String input = "race a car";
    boolean expected = false;
    boolean result = new Solution().isPalindrome(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: ' '. Should return: true")
  void isPalindrome3() {
    String input = " ";
    boolean expected = true;
    boolean result = new Solution().isPalindrome(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: 'aa'. Should return: true")
  void isPalindrome4() {
    String input = "aa";
    boolean expected = true;
    boolean result = new Solution().isPalindrome(input);

    assertEquals(expected, result);
  }
}