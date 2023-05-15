package leetcode.problems.medium.p0003;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public int lengthOfLongestSubstring(String s) {
    char[] ch = new char[s.length()];
    s.getChars(0, s.length(), ch, 0);
    int maxLen = 0;

    List<Character> list = new ArrayList<>();

    for (int i = 0, j = 0; i < ch.length; i++) {

      if (list.contains(ch[i])) {
        list.subList(0, list.lastIndexOf(ch[i]) + 1).clear();
        list.add(ch[i]);
        i = j++;
        continue;
      }

      list.add(ch[i]);
      maxLen = Math.max(maxLen, list.size());
      i = j++;
    }

    return maxLen;
  }

}
