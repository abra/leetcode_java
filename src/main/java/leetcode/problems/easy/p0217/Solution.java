package leetcode.problems.easy.p0217;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  /**
   * Checks if an array contains any duplicate elements.
   *
   * @param nums The array to be checked.
   * @return True if the array contains duplicates, false otherwise.
   */
  public boolean containsDuplicate(int[] nums) {
    Map<Integer, Integer> numsMap = new HashMap<>();

    for (int num : nums) {
      int count = numsMap.getOrDefault(num, 0);

      // If a duplicate is found, return true
      if (count > 0) {
        return true;
      }

      numsMap.put(num, 1);
    }

    // No duplicates found
    return false;
  }
}
