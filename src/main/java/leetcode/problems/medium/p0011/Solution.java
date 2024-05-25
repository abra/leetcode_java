package leetcode.problems.medium.p0011;

public class Solution {
  public int maxArea(int[] height) {
    int max = 0;
    int left = 0;
    int right = height.length - 1;

    if (height.length == 2) {
      max = Math.min(height[0], height[1]);
    }

    while (left < right) {
      if (height[left] <= height[right]) {
        max = Math.max(height[left] * (right - left), max);
        left++;
      } else if (height[left] >= height[right]) {
        max = Math.max(height[right] * (right - left), max);
        right--;
      } else {
        max = Math.max(height[right] * (right - left), max);
        break;
      }
    }

    return max;
  }
}
