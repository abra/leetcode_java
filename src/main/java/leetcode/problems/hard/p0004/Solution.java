package leetcode.problems.hard.p0004;

public class Solution {

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] merged = new int[nums1.length + nums2.length];
    int counter = 0;
    int i = 0;
    int j = 0;

    while (counter < merged.length) {

      if (i <= nums1.length - 1 && j <= nums2.length - 1 && nums1[i] < nums2[j]) {
        merged[counter] = nums1[i];
        i++;
        counter++;
      } else if (i <= nums1.length - 1 && j <= nums2.length - 1 && nums1[i] >= nums2[j]) {
        merged[counter] = nums2[j];
        j++;
        counter++;
      } else if (i == nums1.length && j < nums2.length) {
        merged[counter] = nums2[j];
        j++;
        counter++;
      } else if (i < nums1.length && j == nums2.length) {
        merged[counter] = nums1[i];
        i++;
        counter++;
      }

    }

    return merged.length % 2 == 0
        ? (double) (merged[merged.length / 2 - 1] + merged[merged.length / 2]) / 2
        : merged[merged.length / 2];
  }
}
