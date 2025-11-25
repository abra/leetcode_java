package leetcode.problems.easy.p0058;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

  @Test
  @DisplayName("Input: s = \"Hello World\". Should return: 5")
  void lengthOfLastWord1() {
    assertEquals(5, new Solution().lengthOfLastWord("Hello World"));
  }

  @Test
  @DisplayName("Input: s = \"   fly me   to   the moon  \". Should return: 6")
  void lengthOfLastWord2() {
    var result = new Solution().lengthOfLastWord("   fly me   to   the moon  ");
    assertEquals(4, result);
  }

  @Test
  @DisplayName("Input: s = \"luffy is still joyboy\". Should return: 6")
  void lengthOfLastWord3() {
    var result = new Solution().lengthOfLastWord("luffy is still joyboy");
    assertEquals(6, result);
  }
}