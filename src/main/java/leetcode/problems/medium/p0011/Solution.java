package leetcode.problems.medium.p0011;

public class Solution {
  public int maxArea(int[] height) {
    int max = 0;
    int leftIndex = 0;
    int rightIndex = height.length - 1;

    if (height.length == 2) {
      max = Math.min(height[0], height[1]);
    }

    while (leftIndex < rightIndex) {
      if (height[leftIndex] <= height[rightIndex]) {
        max = Math.max(height[leftIndex] * (rightIndex - leftIndex), max);
        leftIndex++;
      } else if (height[leftIndex] >= height[rightIndex]) {
        max = Math.max(height[rightIndex] * (rightIndex - leftIndex), max);
        rightIndex--;
      } else {
        max = Math.max(height[rightIndex] * (rightIndex - leftIndex), max);
        break;
      }
    }

    return max;
  }
}
