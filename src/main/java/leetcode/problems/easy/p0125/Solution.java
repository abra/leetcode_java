package leetcode.problems.easy.p0125;

public class Solution {
  public boolean isPalindrome(String s) {
    s = s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();

    if (s.isEmpty()) return true;

    char[] chars = s.toCharArray();
    int left = 0;
    int right = chars.length - 1;

    while (left < right) {
      boolean isPalindrome = chars[left] == chars[right];

      if (isPalindrome) {
        left++;
        right--;
      } else {
        return false;
      }
    }

    return true;
  }
}
