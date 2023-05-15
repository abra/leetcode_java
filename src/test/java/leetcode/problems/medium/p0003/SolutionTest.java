package leetcode.problems.medium.p0003;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
@DisplayName("Leetcode Problem #3. Longest Substring Without Repeating Characters")
class SolutionTest {

  @Test
  @DisplayName("Input: \"abcabcbb\". Should return: 3")
  void lengthOfLongestSubstring1() {
    String input = "abcabcbb";
    int expected = 3;
    int result = new Solution().lengthOfLongestSubstring(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: \"bbbbb\". Should return: 1")
  void lengthOfLongestSubstring2() {
    String input = "bbbbb";
    int expected = 1;
    int result = new Solution().lengthOfLongestSubstring(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: \"pwwkew\". Should return: 3")
  void lengthOfLongestSubstring3() {
    String input = "pwwkew";
    int expected = 3;
    int result = new Solution().lengthOfLongestSubstring(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: \" \". Should return: 1")
  void lengthOfLongestSubstring4() {
    String input = " ";
    int expected = 1;
    int result = new Solution().lengthOfLongestSubstring(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: \"c\". Should return: 1")
  void lengthOfLongestSubstring5() {
    String input = "c";
    int expected = 1;
    int result = new Solution().lengthOfLongestSubstring(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: \"aab\". Should return: 2")
  void lengthOfLongestSubstring6() {
    String input = "aab";
    int expected = 2;
    int result = new Solution().lengthOfLongestSubstring(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: \"dvdf\". Should return: 3")
  void lengthOfLongestSubstring7() {
    String input = "dvdf";
    int expected = 3;
    int result = new Solution().lengthOfLongestSubstring(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: \"ckilbkd\". Should return: 5")
  void lengthOfLongestSubstring8() {
    String input = "ckilbkd";
    int expected = 5;
    int result = new Solution().lengthOfLongestSubstring(input);

    assertEquals(expected, result);
  }

}
