package leetcode.problems.easy.p0217;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://leetcode.com/problems/contains-duplicate/
@DisplayName("LeetCode Problem #217. Contains Duplicate")
class SolutionTest {
  @Test
  @DisplayName("Input nums = [1,2,3,1]. Should return: true")
  void containsDuplicate1() {
    int[] nums = {1, 2, 3, 1};
    boolean expected = true;
    boolean result = new Solution().containsDuplicate(nums);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input nums = [1,2,3,4]. Should return: false")
  void containsDuplicate2() {
    int[] nums = {1, 2, 3, 4};
    boolean expected = false;
    boolean result = new Solution().containsDuplicate(nums);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input nums = [1,1,1,3,3,4,3,2,4,2]. Should return: true")
  void containsDuplicate3() {
    int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    boolean expected = true;
    boolean result = new Solution().containsDuplicate(nums);

    assertEquals(expected, result);
  }
}