package leetcode.problems.medium.p0049;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://leetcode.com/problems/group-anagrams/
@DisplayName("LeetCode problem #49. Group Anagrams")
class SolutionTest {

  private List<List<String>> sortListOfLists(List<List<String>> listOfLists) {
    List<List<String>> mutableListOfLists = new ArrayList<>();
    for (List<String> list : listOfLists) {
      List<String> mutableList = new ArrayList<>(list);
      Collections.sort(mutableList);
      mutableListOfLists.add(mutableList);
    }
    mutableListOfLists.sort(Comparator.comparing(Object::toString));
    return mutableListOfLists;
  }

  @Test
  @DisplayName("Input: strs = [eat,tea,tan,ate,nat,bat]. Should return: [[bat],[nat,tan],[ate,eat,tea]]")
  void groupAnagrams1() {
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> expected =
        List.of(
            List.of("bat"),
            List.of("nat", "tan"),
            List.of("ate", "eat", "tea")
        );
    List<List<String>> result = new Solution().groupAnagrams(strs);
    assertEquals(sortListOfLists(expected), sortListOfLists(result));
  }

  @Test
  @DisplayName("Input: strs = [\"\"]. Should return: [[\"\"]]")
  void groupAnagrams2() {
    String[] strs = {""};
    List<List<String>> expected = List.of(
        List.of("")
    );
    List<List<String>> result = new Solution().groupAnagrams(strs);
    assertEquals(expected, result);
  }

  @Test
  @DisplayName("Input: strs = [\"a\"]. Should return: [[\"a\"]]")
  void groupAnagrams3() {
    String[] strs = {"a"};
    List<List<String>> expected = List.of(
        List.of("a")
    );
    List<List<String>> result = new Solution().groupAnagrams(strs);
    assertEquals(expected, result);
  }
}