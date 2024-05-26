package leetcode.problems.easy.p0202;

public class Solution {
  public boolean isHappy(int n) {
    if (n == 1) return true;

    if (n < 10 && n % 2 == 0) return false;

    int x = 0;
    while (n != 0) {
      x += (int) Math.pow(n % 10, 2);
      n = n / 10;
    }
    return isHappy(x);
  }
}