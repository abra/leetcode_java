package leetcode.problems.medium.p0347;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// https://leetcode.com/problems/top-k-frequent-elements/
@DisplayName("LeetCode Problem #347. Top K Frequent Elements")
class SolutionTest {

  @Test
  @DisplayName("Input: nums = [1,1,1,2,2,3], k = 2. Should return: [1,2]")
  void topKFrequent1() {
    int[] nums = new int[]{1, 1, 1, 2, 2, 3};
    int k = 2;
    int[] expected = new int[]{1, 2};
    int[] result = new Solution().topKFrequent(nums, k);
    assertArrayEquals(expected, result);
  }

  @Test
  @DisplayName("Input: nums = [1], k = 1. Should return: [1]")
  void topKFrequent2() {
    int[] nums = new int[]{1};
    int k = 1;
    int[] expected = new int[]{1};
    int[] result = new Solution().topKFrequent(nums, k);
    assertArrayEquals(expected, result);
  }

  @Test
  @DisplayName("Input: nums = [4,1,-1,2,-1,2,3], k = 2. Should return: [2, -1]")
  void topKFrequent3() {
    int[] nums = new int[]{4, 1, -1, 2, -1, 2, 3};
    int k = 2;
    int[] expected = new int[]{-1, 2};
    int[] result = new Solution().topKFrequent(nums, k);
    assertArrayEquals(expected, result);
  }
}