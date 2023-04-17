package leetcode.problems.hard.p0004;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// https://leetcode.com/problems/median-of-two-sorted-arrays/
@DisplayName("Leetcode Problem #4. Median of Two Sorted Arrays")
class SolutionTest {

  @Test
  @DisplayName("Input: nums1 = [1,3], nums2 = [2]. Should return: 2.00000")
  void findMedianSortedArrays1() {
    int[] nums1 = {1, 3};
    int[] nums2 = {2};
    double expected = 2.00000;
    double result = new Solution().findMedianSortedArrays(nums1, nums2);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: nums1 = [1,2], nums2 = [3,4]. Should return: 2.50000")
  void findMedianSortedArrays2() {
    int[] nums1 = {1, 2};
    int[] nums2 = {3, 4};
    double expected = 2.50000;
    double result = new Solution().findMedianSortedArrays(nums1, nums2);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: nums1 = [1,2,5,9,9], nums2 = [3,4,7]. Should return: 4.50000")
  void findMedianSortedArrays3() {
    int[] nums1 = {1, 2, 5, 9, 9};
    int[] nums2 = {3, 4, 7};
    double expected = 4.50000;
    double result = new Solution().findMedianSortedArrays(nums1, nums2);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: nums1 = [1,6], nums2 = [4,0,7]. Should return: 0.00000")
  void findMedianSortedArrays4() {
    int[] nums1 = {1, 6};
    int[] nums2 = {4, 0, 7};
    double expected = 0.00000;
    double result = new Solution().findMedianSortedArrays(nums1, nums2);

    assertEquals(expected, result);
  }
}