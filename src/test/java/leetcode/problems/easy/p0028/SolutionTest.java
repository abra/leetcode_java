package leetcode.problems.easy.p0028;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
@DisplayName("LeetCode Problem #28. Find the Index of the First Occurrence in a String")
class SolutionTest {

  @Test
  @DisplayName("Input: haystack = \"sadbutsad\", needle = \"sad\". Should return: 0")
  void strStr1() {
    assertEquals(0, new Solution().strStr("sadbutsad", "sad"));
  }

  @Test
  @DisplayName("Input: haystack = \"leetcode\", needle = \"leeto\". Should return: -1")
  void strStr2() {
    assertEquals(-1, new Solution().strStr("leetcode", "leeto"));
  }
}