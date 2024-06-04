package leetcode.problems.medium.p0075;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// https://leetcode.com/problems/sort-colors/
@DisplayName("LeetCode problem #75. Sort Colors")
class SolutionTest {

  @Test
  @DisplayName("Input: nums = [2,0,2,1,1,0]. Should return: [0,0,1,1,2,2]")
  void sortColors1() {
    int[] nums = {2, 0, 2, 1, 1, 0};
    int[] expected = {0, 0, 1, 1, 2, 2};
    new Solution().sortColors(nums);
    assertArrayEquals(expected, nums);
  }

  @Test
  @DisplayName("Input: nums = [2,0,1]. Should return: [0,1,2]")
  void sortColors2() {
    int[] nums = {2, 0, 1};
    int[] expected = {0, 1, 2};
    new Solution().sortColors(nums);
    assertArrayEquals(expected, nums);
  }

  @Test
  @DisplayName("Input: nums = [0]. Should return: [0]")
  void sortColors3() {
    int[] nums = {0};
    int[] expected = {0};
    new Solution().sortColors(nums);
    assertArrayEquals(expected, nums);
  }

  @Test
  @DisplayName("Input: nums = [1,0,2]. Should return: [0,1,2]")
  void sortColors4() {
    int[] nums = {1, 0, 2};
    int[] expected = {0, 1, 2};
    new Solution().sortColors(nums);
    assertArrayEquals(expected, nums);
  }
}