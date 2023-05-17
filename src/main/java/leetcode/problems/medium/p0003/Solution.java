package leetcode.problems.medium.p0003;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public int lengthOfLongestSubstring(String s) {
    char[] ch = new char[s.length()];
    s.getChars(0, s.length(), ch, 0);
    int maxLen = 0;

    List<Character> window = new ArrayList<>();

    for (int i = 0, j = 0; i < ch.length; i++) {

      if (window.contains(ch[i])) {
        window.subList(0, window.lastIndexOf(ch[i]) + 1).clear();
        window.add(ch[i]);
        i = j++;
        continue;
      }

      window.add(ch[i]);
      maxLen = Math.max(maxLen, window.size());
      i = j++;
    }

    return maxLen;
  }

}
