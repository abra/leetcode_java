package leetcode.problems.medium.p0238;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// https://leetcode.com/problems/product-of-array-except-self/
@DisplayName("LeetCode Problem #238. Product of Array Except Self")
class SolutionTest {

  @Test
  @DisplayName("Input: nums = [1,2,3,4]. Should return: [24,12,8,6]")
  void productExceptSelf1() {
    int[] nums = new int[]{1, 2, 3, 4};
    int[] expected = new int[]{24, 12, 8, 6};
    int[] result = new Solution().productExceptSelf(nums);
    assertArrayEquals(expected, result);
  }

  @Test
  @DisplayName("Input: nums = [-1,1,0,-3,3]. Should return: [0,0,9,0,0]")
  void productExceptSelf2() {
    int[] nums = new int[]{-1, 1, 0, -3, 3};
    int[] expected = new int[]{0, 0, 9, 0, 0};
    int[] result = new Solution().productExceptSelf(nums);
    assertArrayEquals(expected, result);
  }
}