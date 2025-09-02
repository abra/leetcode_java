package leetcode.problems.easy.p0028;

public class Solution {
  public int strStr(String haystack, String needle) {
    int haystackLength = haystack.length();
    int needleLength = needle.length();

    if (haystackLength < needleLength) {
      return -1;
    }

    int startIndex = -1;
    int step = 0;

    for (int i = 0; i < haystackLength; i++) {
      if (haystack.charAt(i) == needle.charAt(step)) {
        if (startIndex == -1) {
          startIndex = i;
        }
        step++;
      } else {
        if (startIndex != -1) {
          i = startIndex;
          startIndex = -1;
        }
        step = 0;
      }

      if (step == needleLength) {
        return startIndex;
      }
    }

    return -1;
  }
}
