package leetcode.problems.easy.p0058;

public class Solution {
  public int lengthOfLastWord(String s) {
    int count = 0;
    var chars = s.toCharArray();
    boolean isRightSpace = true;

    for (int i = chars.length - 1; i >= 0; i--) {
      if (chars[i] == ' ' && isRightSpace) {
        continue;
      }

      if (chars[i] != ' ') {
        count++;
        isRightSpace = false;
      }

      if (chars[i] == ' ' && !isRightSpace) {
        break;
      }
    }

    return count;
  }
}
