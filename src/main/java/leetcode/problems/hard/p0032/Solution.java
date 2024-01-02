package leetcode.problems.hard.p0032;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

  public int longestValidParentheses(String s) {

    if (s.isEmpty()) return 0;

    char[] chars = s.toCharArray();
    Deque<Character> stack = new ArrayDeque<>();
    Deque<Integer> indices = new ArrayDeque<>();

    for (int i = 0; i < chars.length; i++) {

      if (!stack.isEmpty() && stack.peek() == '(' && chars[i] == ')') {
        indices.pollLast();
        stack.poll();
      } else {
        indices.addLast(i);
        stack.addFirst(chars[i]);
      }

    }

    int counter = 0;
    int max = 0;

    for (int i = 0; i < chars.length; i++) {

      if (!indices.isEmpty() && i == indices.peekFirst()) {
        indices.pollFirst();
        counter = 0;
      } else {
        counter++;
      }

      max = Math.max(counter, max);
    }

    return max;
  }
}
