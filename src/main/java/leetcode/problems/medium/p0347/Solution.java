package leetcode.problems.medium.p0347;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
  // TODO: Optimize this solution (runtime 15ms, memory 47.93MB)
  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();

    for (int num : nums) {
      frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }

    List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(frequencyMap.entrySet());

    entries.sort((a, b) -> b.getValue() - a.getValue());

    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
      result[i] = entries.get(i).getKey();
    }

    return result;
  }
}
