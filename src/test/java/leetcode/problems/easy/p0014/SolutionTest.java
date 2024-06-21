package leetcode.problems.easy.p0014;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://leetcode.com/problems/longest-common-prefix/
@DisplayName("LeetCode Problem #14. Longest Common Prefix")
class SolutionTest {

  @Test
  @DisplayName("Input: [\"flower\",\"flow\",\"flight\"]. Should return: \"fl\"")
  void longestCommonPrefix1() {
    String[] strs = {"flower", "flow", "flight"};
    String expected = "fl";
    String result = new Solution().longestCommonPrefix(strs);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: [\"dog\",\"racecar\",\"car\"]. Should return: \"\"")
  void longestCommonPrefix2() {
    String[] strs = {"dog", "racecar", "car"};
    String expected = "";
    String result = new Solution().longestCommonPrefix(strs);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: [\"apricot\",\"apartment\",\"apple\"]. Should return: \"ap\"")
  void longestCommonPrefix3() {
    String[] strs = {"apricot", "apartment", "apple"};
    String expected = "ap";
    String result = new Solution().longestCommonPrefix(strs);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: [\"testing\"]. Shouldn return: \"testing\"")
  void longestCommonPrefix4() {
    String[] strs = {"testing"};
    String expected = "testing";
    String result = new Solution().longestCommonPrefix(strs);

    assertEquals(expected, result);
  }
}