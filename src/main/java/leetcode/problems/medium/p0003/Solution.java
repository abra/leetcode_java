package leetcode.problems.medium.p0003;

public class Solution {

  public int lengthOfLongestSubstring(String s) {
    int maxLen = 0;
    int[] charIndex = new int[128];

    for (int i = 0, j = 0; j < s.length(); j++) {
      i = Math.max(charIndex[s.charAt(j)], i);
      maxLen = Math.max(maxLen, j - i + 1);
      charIndex[s.charAt(j)] = j + 1;
    }

    return maxLen;
  }

}
