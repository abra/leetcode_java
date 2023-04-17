package leetcode.problems.easy.p0009;

public class Solution {

  public boolean isPalindrome(int x) {
    int cur = 0;
    int mod;
    int t = 1;
    int n = x;

    while (x > 0) {
      mod = x % 10;
      cur = (cur * t) + mod;
      t = 10;

      x /= 10;

    }

    return n == cur;
  }

}