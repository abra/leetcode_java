package leetcode.problems.medium.p0005;

public class Solution {

  public String longestPalindrome(String s) {
    int n = s.length();
    boolean[][] table = new boolean[n][n];

    int maxLength = 1;
    int start = 0;

    for (int i = 0; i < n; i++) {
      table[i][i] = true;
    }

    for (int i = 0; i < n - 1; i++) {
      if (s.charAt(i) == s.charAt(i + 1)) {
        table[i][i + 1] = true;
        start = i;
        maxLength = 2;
      }
    }

    for (int len = 3; len <= n; len++) {
      for (int i = 0; i < n - len + 1; i++) {
        int j = i + len - 1;
        if (s.charAt(i) == s.charAt(j) && table[i + 1][j - 1]) {
          table[i][j] = true;
          start = i;
          maxLength = len;
        }
      }
    }

    return s.substring(start, start + maxLength);
  }

}
