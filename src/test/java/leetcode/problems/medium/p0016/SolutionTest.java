package leetcode.problems.medium.p0016;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  @DisplayName("Input: nums = [-1, 2, 1, -4], target = 1. Should return: 2")
  void threeSumClosest1() {
    int[] nums = {-1, 2, 1, -4};
    int target = 1;
    int expected = 2;
    int result = new Solution().threeSumClosest(nums, target);

    assertEquals(expected, result);
  }
}