package leetcode.problems.easy.p0202;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//https://leetcode.com/problems/happy-number/
@DisplayName("LeetCode Problem #202. Happy Number")
class SolutionTest {

  @Test
  @DisplayName("Input: n = 19. Should return: true")
  void isHappy1() {
    assertTrue(new Solution().isHappy(19));
  }

  @Test
  @DisplayName("Input: n = 2. Should return: false")
  void isHappy2() {
    assertFalse(new Solution().isHappy(2));
  }

  @Test
  @DisplayName("Input: n = 7. Should return: true")
  void isHappy3() {
    assertTrue(new Solution().isHappy(7));
  }
}