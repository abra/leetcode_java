package leetcode.problems.hard.p0004;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 33};
        int[] b = {2, 3, 44};

        System.out.println(new Solution().findMedianSortedArrays(a, b));
    }

}

// https://leetcode.com/problems/median-of-two-sorted-arrays/
class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] c = new int[nums1.length + nums2.length];

        int counter = 0;
        int aIndex = 0;
        int bIndex = 0;

        while (counter < c.length) {

            if (aIndex <= nums1.length - 1 && bIndex <= nums2.length - 1 && nums1[aIndex] < nums2[bIndex]) {
                c[counter] = nums1[aIndex];
                aIndex++;
                counter++;
            } else if (aIndex <= nums1.length - 1 && bIndex <= nums2.length - 1 && nums1[aIndex] >= nums2[bIndex]) {
                c[counter] = nums2[bIndex];
                bIndex++;
                counter++;
            } else if (aIndex == nums1.length && bIndex < nums2.length) {
                c[counter] = nums2[bIndex];
                bIndex++;
                counter++;
            } else if (aIndex < nums1.length && bIndex == nums2.length) {
                c[counter] = nums1[aIndex];
                aIndex++;
                counter++;
            }

        }

        return c.length % 2 == 0
                ? (double) (c[c.length / 2 - 1] + c[c.length / 2]) / 2
                : c[c.length / 2];
    }
}
