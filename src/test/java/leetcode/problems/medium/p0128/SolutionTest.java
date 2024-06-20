package leetcode.problems.medium.p0128;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://leetcode.com/problems/longest-consecutive-sequence
@DisplayName("LeetCode Problem #128: Longest Consecutive Sequence")
class SolutionTest {

  @Test
  @DisplayName("Input nums = [100,4,200,1,3,2]. Should return: 4")
  void longestConsecutive1() {
    int[] nums = {100, 4, 200, 1, 3, 2};
    int expected = 4;
    int result = new Solution().longestConsecutive(nums);
    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input nums = [0,3,7,2,5,8,4,6,0,1]. Should return: 9")
  void longestConsecutive2() {
    int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
    int expected = 9;
    int result = new Solution().longestConsecutive(nums);
    assertEquals(expected, result);
  }
}