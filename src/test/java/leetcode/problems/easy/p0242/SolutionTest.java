package leetcode.problems.easy.p0242;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://leetcode.com/problems/valid-anagram/
@DisplayName("Leetcode Problem #242. Valid Anagram")
class SolutionTest {
  @Test
  @DisplayName("Input: s = 'anagram', t = 'nagaram'. Output: true")
  void isAnagram1() {
    String s = "anagram";
    String t = "nagaram";
    boolean expected = true;
    boolean result = new Solution().isAnagram(s, t);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: s = 'rat', t = 'car'. Output: false")
  void isAnagram2() {
    String s = "rat";
    String t = "car";
    boolean expected = false;
    boolean result = new Solution().isAnagram(s, t);

    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: s = 'рок', t = 'ток'. Output: false")
  void isAnagram3() {
    String s = "рок";
    String t = "ток";
    boolean expected = false;
    boolean result = new Solution().isAnagram(s, t);

    assertEquals(expected, result);
  }
}