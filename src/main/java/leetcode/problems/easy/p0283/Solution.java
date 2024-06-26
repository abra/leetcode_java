package leetcode.problems.easy.p0283;

public class Solution {
  public void moveZeroes(int[] nums) {
    int l = 0;
    int r = 0;
    while (r < nums.length) {
      if (nums[r] != 0) {
        int temp = nums[r];
        nums[r] = nums[l];
        nums[l] = temp;
        l++;
      }
      r++;
    }
  }
}
