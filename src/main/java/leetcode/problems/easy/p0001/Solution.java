package leetcode.problems.easy.p0001;

import java.util.HashMap;
import java.util.Map;

class Solution {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int reminder = target - nums[i];

      if (numMap.containsKey(reminder)) {
        return new int[]{numMap.get(reminder), i};
      }

      numMap.put(nums[i], i);
    }

    return new int[0];
  }
}

