package leetcode.problems.medium.p0011;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #11. Container With Most Water")
class SolutionTest {

  @Test
  @DisplayName("Input: height = [1,8,6,2,5,4,8,3,7]. Should return: 49")
  void maxArea1() {
    int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    int expected = 49;
    int result = new Solution().maxArea(height);
    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: height = [1,1]. Should return: 1")
  void maxArea2() {
    int[] height = {1,1};
    int expected = 1;
    int result = new Solution().maxArea(height);
    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: height = [4,3,2,1,4]. Should return: 16")
  void maxArea3() {
    int[] height = {4,3,2,1,4};
    int expected = 16;
    int result = new Solution().maxArea(height);
    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: height = [0,2]. Should return: 0")
  void maxArea4() {
    int[] height = {0,2};
    int expected = 0;
    int result = new Solution().maxArea(height);
    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: height = [1,3,2,5,25,24,5]. Should return: 24")
  void maxArea5() {
    int[] height = {1,3,2,5,25,24,5};
    int expected = 24;
    int result = new Solution().maxArea(height);
    assertEquals(expected, result);
  }
}