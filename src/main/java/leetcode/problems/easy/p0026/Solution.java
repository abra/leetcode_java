package leetcode.problems.easy.p0026;

public class Solution {
  public int removeDuplicates(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    int k = 0;

    while (left <= nums.length - 1) {
      int cur = nums[left] - nums[right];

      if (cur == 0) {
        nums[k++] = nums[left];
        left = right + 1;
        right = nums.length - 1;
      } else {
        right--;
      }
    }

    return k;
  }
}
