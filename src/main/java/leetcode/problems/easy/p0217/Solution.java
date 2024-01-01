package leetcode.problems.easy.p0217;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public boolean containsDuplicate(int[] nums) {
    Map<Integer, Integer> numsMap = new HashMap<>();

    for (int num : nums) {
      int count = numsMap.getOrDefault(num, 0);

      if (count > 0) {
        return true;
      }

      numsMap.put(num, count + 1);
    }
    return false;
  }
}

