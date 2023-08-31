package leetcode.problems.medium.p0015;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://leetcode.com/problems/3sum/
@DisplayName("Leetcode Problem #15. 3Sum")
class SolutionTest {

  @Test
  @DisplayName("Input: nums = [-1, 0, 1, 2, -1, -4]. Should return: [[-1, -1, 2], [-1, 0, 1]]")
  void threeSum1() {
    int[] nums = {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> expected = List.of(
        List.of(-1, -1, 2),
        List.of(-1, 0, 1)
    );
    List<List<Integer>> result = new Solution().threeSum(nums);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: nums = [0, 1, 1]. Should return: []")
  void threeSum2() {
    int[] nums = {0, 1, 1};
    List<List<Integer>> expected = List.of();
    List<List<Integer>> result = new Solution().threeSum(nums);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: nums = [0, 0, 0]. Should return: [[0, 0, 0]]")
  void threeSum3() {
    int[] nums = {0, 0, 0};
    List<List<Integer>> expected = List.of(
        List.of(0, 0, 0)
    );
    List<List<Integer>> result = new Solution().threeSum(nums);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: nums = [0, 0, 0, 0]. Should return: [[0, 0, 0]]")
  void threeSum4() {
    int[] nums = {0, 0, 0, 0};
    List<List<Integer>> expected = List.of(
        List.of(0, 0, 0)
    );
    List<List<Integer>> result = new Solution().threeSum(nums);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: nums = [-2,0,1,1,2]. Should return: [[-2,0,2],[-2,1,1]]")
  void threeSum5() {
    int[] nums = {-2, 0, 1, 1, 2};
    List<List<Integer>> expected = List.of(
        List.of(-2, 0, 2),
        List.of(-2, 1, 1)
    );
    List<List<Integer>> result = new Solution().threeSum(nums);

    assertEquals(expected, result);
  }
}
