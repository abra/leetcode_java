package leetcode.problems.easy.p0344;

public class Solution {
  public void reverseString(char[] s) {
    int len = s.length / 2;
    for (int i = 0; i < len; i++) {
      char temp = s[i];
      s[i] = s[s.length - 1 - i];
      s[s.length - 1 - i] = temp;
    }
  }
}
