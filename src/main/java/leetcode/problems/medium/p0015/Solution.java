package leetcode.problems.medium.p0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);

    if (nums.length < 3) {
      return result;
    }

    for (int x = 0; x < nums.length - 2; x++) {
      if (x > 0 && nums[x] == nums[x - 1]) {
        continue;
      }

      int target = -nums[x];
      int y = x + 1;
      int z = nums.length - 1;

      while (y < z) {
        int sum = nums[y] + nums[z];

        if (sum == target) {
          result.add(List.of(nums[x], nums[y], nums[z]));

          while (y < z && nums[y] == nums[y + 1]) {
            y++;
          }

          while (y < z && nums[z] == nums[z - 1]) {
            z--;
          }
          y++;
          z--;
        } else if (sum < target) {
          y++;
        } else {
          z--;
        }
      }
    }

    return result;
  }
}
