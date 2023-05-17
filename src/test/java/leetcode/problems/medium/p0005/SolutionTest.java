package leetcode.problems.medium.p0005;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// https://leetcode.com/problems/longest-palindromic-substring/
@DisplayName("Leetcode Problem #5. Longest Palindromic Substring")
class SolutionTest {

  @Test
  @DisplayName("Input: \"babad\". Should return: \"bab\"")
  void longestPalindrome1() {
    String input = "babad";
    List<String> expected = List.of("bab", "aba");
    String result = new Solution().longestPalindrome(input);

    assertTrue(expected.contains(result));
  }

  @Test
  @DisplayName("Input: \"cbbd\". Should return: \"bb\"")
  void longestPalindrome2() {
    String input = "cbbd";
    String expected = "bb";
    String result = new Solution().longestPalindrome(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: \"xoodfjwhoweifwhwwdodododhwhheeieiehe\". Should return: \"dododod\"")
  void longestPalindrome3() {
    String input = "xoodfjwhoweifwhwwdodododhwhheeieiehe";
    String expected = "dododod";
    String result = new Solution().longestPalindrome(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: \"mississipi\". Should return: \"ississi\"")
  void longestPalindrome4() {
    String input = "mississipi";
    String expected = "ississi";
    String result = new Solution().longestPalindrome(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: \"a\". Should return: \"a\"")
  void longestPalindrome5() {
    String input = "a";
    String expected = "a";
    String result = new Solution().longestPalindrome(input);

    assertEquals(expected, result);
  }
}