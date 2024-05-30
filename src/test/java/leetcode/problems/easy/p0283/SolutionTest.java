package leetcode.problems.easy.p0283;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// https://leetcode.com/problems/move-zeroes/
@DisplayName("LeetCode problem #283. Move Zeroes")
class SolutionTest {

  @Test
  @DisplayName("Input: nums = [0,1,0,3,12]. Should return: nums = [1,3,12,0,0]")
  void moveZeroes1() {
    int[] nums = {0, 1, 0, 3, 12};
    int[] expected = {1, 3, 12, 0, 0};
    new Solution().moveZeroes(nums);
    assertArrayEquals(expected, nums);
  }

  @Test
  @DisplayName("Input: nums = [0]. Should return: nums = [0]")
  void moveZeroes2() {
    int[] nums = {0};
    int[] expected = {0};
    new Solution().moveZeroes(nums);
    assertArrayEquals(expected, nums);
  }

  @Test
  @DisplayName("Input: nums = [1, 0, 5, 0, 8, 12, 0, 31]. Should return: nums = [1, 5, 8, 12, 31, 0, 0, 0]")
  void moveZeroes3() {
    int[] nums = {1, 0, 5, 0, 8, 12, 0, 31};
    int[] expected = {1, 5, 8, 12, 31, 0, 0, 0};
    new Solution().moveZeroes(nums);
    assertArrayEquals(expected, nums);
  }
}