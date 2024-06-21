package leetcode.problems.medium.p0151;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://leetcode.com/problems/reverse-words-in-a-string/
@DisplayName("LeetCode Problem #151. Reverse Words in a String")
class SolutionTest {

  @Test
  @DisplayName("Input: \"the sky is blue\". Should return: \"blue is sky the\"")
  void reverseWords1() {
    String input = "the sky is blue";
    String expected = "blue is sky the";
    String result = new Solution().reverseWords(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: \"  hello world  \". Should return: \"world hello\"")
  void reverseWords2() {
    String input = "  hello world  ";
    String expected = "world hello";
    String result = new Solution().reverseWords(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: \"a good   example\". Should return: \"example good a\"")
  void reverseWords3() {
    String input = "a good   example";
    String expected = "example good a";
    String result = new Solution().reverseWords(input);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: \"Do or do not. There is no try - Yoda\". Should return: \"Yoda - try no is There not. do or Do\"")
  void reverseWords4() {
    String input = "Do or do not. There is no try - Yoda";
    String expected = "Yoda - try no is There not. do or Do";
    String result = new Solution().reverseWords(input);

    assertEquals(expected, result);
  }
}