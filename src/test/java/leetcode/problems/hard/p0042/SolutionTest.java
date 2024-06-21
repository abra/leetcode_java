package leetcode.problems.hard.p0042;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://leetcode.com/problems/trapping-rain-water
@DisplayName("LeetCode Problem #42. Trapping Rain Water")
class SolutionTest {

  @Test
  @DisplayName("Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]. Should return: 6")
  void trap1() {
    int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    int expected = 6;
    int result = new Solution().trap(height);
    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: height = [4,2,0,3,2,5]. Should return: 9")
  void trap2() {
    int[] height = {4, 2, 0, 3, 2, 5};
    int expected = 9;
    int result = new Solution().trap(height);
    assertEquals(expected, result);
  }
}