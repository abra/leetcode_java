package leetcode.problems.medium.p0128;

import java.util.Arrays;

public class Solution {
  public int longestConsecutive(int[] nums) {
    if (nums.length == 0) return 0;

    Arrays.sort(nums);

    int longest = 0;

    for (int i = 0, temp = 0; i < nums.length - 1; i++) {
      if (nums[i + 1] - nums[i] > 1) {
        temp = 0;
      } else if (nums[i + 1] - nums[i] == 1) {
        temp++;
      }
      if (temp > longest) longest = temp;
    }

    return longest + 1;
  }
}
