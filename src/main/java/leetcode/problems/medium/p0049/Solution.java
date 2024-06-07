package leetcode.problems.medium.p0049;

import java.util.*;

public class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();

    for (String s : strs) {
      char[] chars = s.toCharArray();
      Arrays.sort(chars);
      String sorted = String.valueOf(chars);
      var list = map.getOrDefault(sorted, null);
      if (list == null) {
        map.put(sorted, List.of(s));
      } else {
        var newList = new ArrayList<>(list);
        newList.add(s);
        map.put(sorted, newList);
      }
    }

    return new ArrayList<>(map.values());
  }
}
