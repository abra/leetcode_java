package leetcode.problems.easy.p0001;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// https://leetcode.com/problems/two-sum
@DisplayName("LeetCode Problem #1. Two Sum")
class SolutionTest {

  @Test
  @DisplayName("Input: nums = [2,7,11,15], target = 9. Should return: [0,1]")
  void twoSum1() {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] expected = {0, 1};
    int[] result = new Solution().twoSum(nums, target);

    Arrays.sort(expected);
    Arrays.sort(result);

    assertArrayEquals(expected, result);
  }

  @Test
  @DisplayName("Input: nums = [3,2,4], target = 6. Should return: [1,2]")
  void twoSum2() {
    int[] nums = {3, 2, 4};
    int target = 6;
    int[] expected = {1, 2};
    int[] result = new Solution().twoSum(nums, target);

    Arrays.sort(expected);
    Arrays.sort(result);

    assertArrayEquals(expected, result);
  }

  @Test
  @DisplayName("Input: nums = [3,3], target = 6. Should return: [0,1]")
  void twoSum3() {
    int[] nums = {3, 3};
    int target = 6;
    int[] expected = {0, 1};
    int[] result = new Solution().twoSum(nums, target);

    Arrays.sort(expected);
    Arrays.sort(result);

    assertArrayEquals(expected, result);
  }

  @Test
  @DisplayName("Input: nums = [3,1,8,11,3], target = 4. Should return: [0,1]")
  void twoSum4() {
    int[] nums = {3, 1, 8, 11, 3};
    int target = 4;
    int[] expected = {0, 1};
    int[] result = new Solution().twoSum(nums, target);

    Arrays.sort(expected);
    Arrays.sort(result);

    assertArrayEquals(expected, result);
  }

  @Test
  @DisplayName("Input: nums = [2,5,5,11], target = 10. Should return: [1,2]")
  void twoSum5() {
    int[] nums = {2, 5, 5, 11};
    int target = 10;
    int[] expected = {1, 2};
    int[] result = new Solution().twoSum(nums, target);

    Arrays.sort(expected);
    Arrays.sort(result);

    assertArrayEquals(expected, result);
  }

  @Test
  @DisplayName("Input: nums = [8,13,34,21,11,9], target = 22. Should return: [1,5]")
  void twoSum6() {
    int[] nums = {8, 13, 35, 21, 11, 9};
    int target = 22;
    int[] expected = {1, 5};
    int[] result = new Solution().twoSum(nums, target);

    Arrays.sort(expected);
    Arrays.sort(result);

    assertArrayEquals(expected, result);
  }

  @Test
  @DisplayName("Input: nums = [0,4,3,0], target = 0. Should return: [0,3]")
  void twoSum7() {
    int[] nums = {0,4,3,0};
    int target = 0;
    int[] expected = {0, 3};
    int[] result = new Solution().twoSum(nums, target);

    Arrays.sort(expected);
    Arrays.sort(result);

    assertArrayEquals(expected, result);
  }
}