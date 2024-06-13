package leetcode.problems.easy.p0217;

import java.util.HashSet;
import java.util.Set;

public class Solution {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> numSet = new HashSet<>();

    for (int num : nums) {
      if (!numSet.add(num)) return true;
    }

    return false;
  }
}
