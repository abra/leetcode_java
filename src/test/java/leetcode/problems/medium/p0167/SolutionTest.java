package leetcode.problems.medium.p0167;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
@DisplayName("Leetcode Problem #167. Two Sum II - Input Array Is Sorted")
class SolutionTest {

  @Test
  @DisplayName("Input: numbers = [2, 7, 11, 15], target = 9. Should return: [1, 2]")
  void twoSum1() {
    int[] numbers = {2, 7, 11, 15};
    int target = 9;

    int[] expected = {1, 2};
    int[] result = new Solution().twoSum(numbers, target);

    assertArrayEquals(expected, result);
  }

  @Test
  @DisplayName("Input: numbers = [2, 3, 4], target = 6. Should return: [1, 3]")
  void twoSum2() {
    int[] numbers = {2, 3, 4};
    int target = 6;

    int[] expected = {1, 3};
    int[] result = new Solution().twoSum(numbers, target);

    assertArrayEquals(expected, result);
  }

  @Test
  @DisplayName("Input: numbers = [-1, 0], target = -1. Should return: [1, 2]")
  void twoSum3() {
    int[] numbers = {-1, 0};
    int target = -1;

    int[] expected = {1, 2};
    int[] result = new Solution().twoSum(numbers, target);

    assertArrayEquals(expected, result);
  }
}
