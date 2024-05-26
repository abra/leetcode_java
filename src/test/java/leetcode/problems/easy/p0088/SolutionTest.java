package leetcode.problems.easy.p0088;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// https://leetcode.com/problems/merge-sorted-array/
@DisplayName("LeetCode #88. Merge Sorted Array")
class SolutionTest {

  @Test
  @DisplayName("Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3. Should return: [1,2,2,3,5,6]")
  void merge1() {
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int[] nums2 = {2, 5, 6};
    int[] expected = {1, 2, 2, 3, 5, 6};
    new Solution().merge(nums1, 3, nums2, 3);
    assertArrayEquals(expected, nums1);
  }

  @Test
  @DisplayName("Input: nums1 = [1], m = 1, nums2 = [], n = 0. Should return: [1]")
  void merge2() {
    int[] nums1 = {1};
    int[] nums2 = {};
    int[] expected = {1};
    new Solution().merge(nums1, 1, nums2, 0);
    assertArrayEquals(expected, nums1);
  }

  @Test
  @DisplayName("Input: nums1 = [0], m = 0, nums2 = [1], n = 1. Should return: [1]")
  void merge3() {
    int[] nums1 = {0};
    int[] nums2 = {1};
    int[] expected = {1};
    new Solution().merge(nums1, 0, nums2, 1);
    assertArrayEquals(expected, nums1);
  }
}