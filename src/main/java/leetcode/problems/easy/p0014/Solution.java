package leetcode.problems.easy.p0014;

import java.util.Arrays;

public class Solution {
  public String longestCommonPrefix(String[] strs) {

    int len = Arrays.stream(strs)
        .map(String::length)
        .min(Integer::compare)
        .orElse(0);

    String s = "";

    for (int i = 0; i < len; i++) {
      int counter = 0;

      for (int j = 0, c = 0; j < strs.length && c < strs.length - 1; j++, c++) {
        if (strs[c].charAt(i) == strs[j + 1].charAt(i)) {
          counter++;
        } else {
          break;
        }
      }

      if (counter == strs.length - 1) {
        s += strs[counter].charAt(i);
      } else {
        break;
      }
    }

    return s.length() == 0 ? "" : s;
  }
}

