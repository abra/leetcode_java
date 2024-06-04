package leetcode.problems.medium.p0075;

public class Solution {
  public void sortColors(int[] nums) {
    int l = 0;
    int r = nums.length - 1;
    int i = 0;
    while (i <= r) {
      if (nums[i] == 0) {
        int temp = nums[i];
        nums[i] = nums[l];
        nums[l] = temp;
        i++;
        l++;
      } else if (nums[i] == 2) {
        int temp = nums[i];
        nums[i] = nums[r];
        nums[r] = temp;
        r--;
      } else {
        i++;
      }
    }
  }
}
