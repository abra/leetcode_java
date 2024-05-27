package leetcode.problems.easy.p0013;

import java.util.Map;

public class Solution {

  private static final Map<Character, Integer> dict = Map.of(
      'I', 1,
      'V', 5,
      'X', 10,
      'L', 50,
      'C', 100,
      'D', 500,
      'M', 1000
  );

  public int romanToInt(String s) {
    int sum = 0;
    int n = s.length();

    for (int i = 0; i < n; i++) {
      int current = dict.get(s.charAt(i));
      if (i < n - 1 && current < dict.get(s.charAt(i + 1))) {
        sum -= current;
      } else {
        sum += current;
      }
    }

    return sum;
  }
}
