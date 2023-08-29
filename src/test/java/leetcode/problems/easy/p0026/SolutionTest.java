package leetcode.problems.easy.p0026;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
@DisplayName("Leetcode Problem #26. Remove Duplicates from Sorted Array")
public class SolutionTest {

  @Test
  @DisplayName("Input: nums = [1,1,2]. Should return: 2, [1, 2, 2]")
  void removeDuplicates1() {
    int[] nums = new int[]{1, 1, 2};
    int result = new Solution().removeDuplicates(nums);
    int expected = 2;

    assertEquals(expected, result);
    assertArrayEquals(new int[]{1, 2, 2}, nums);
  }

  @Test
  @DisplayName("Input: nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]. Should return: 5, [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]")
  void removeDuplicates2() {
    int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int result = new Solution().removeDuplicates(nums);
    System.out.println(Arrays.toString(nums));
    int expected = 5;

    assertEquals(expected, result);
    assertArrayEquals(new int[]{0, 1, 2, 3, 4, 2, 2, 3, 3, 4}, nums);
  }
}
