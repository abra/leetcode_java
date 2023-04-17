package leetcode.problems.easy.p0020;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
  public boolean isValid(String s) {
    char[] chars = s.toCharArray();
    Deque<Character> stack = new ArrayDeque<>();

    for (char c : chars) {
      switch (c) {
        case '(':
        case '[':
        case '{':
          stack.push(c);
          break;
        case ')':
          if (stack.isEmpty() || stack.pop() != '(') {
            return false;
          }
          break;
        case ']':
          if (stack.isEmpty() || stack.pop() != '[') {
            return false;
          }
          break;
        case '}':
          if (stack.isEmpty() || stack.pop() != '{') {
            return false;
          }
          break;
        default:
          return false;
      }
    }

    return stack.isEmpty();
  }
}

