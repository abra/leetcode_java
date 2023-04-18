package leetcode.problems.hard.p0032;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

  public int longestValidParentheses(String s) {

    if (s.isEmpty() || s.isBlank()) return 0;

    String[] parentheses = s.split("");

    Deque<String> stack = new ArrayDeque<>();
    Deque<Integer> indexes = new ArrayDeque<>();

    for (int i = 0; i < parentheses.length; i++) {

      if (!stack.isEmpty() && stack.peek().equals("(") && parentheses[i].equals(")")) {
        indexes.pollLast();
        stack.poll();
      } else {
        indexes.addLast(i);
        stack.addFirst(parentheses[i]);
      }

    }

    int counter = 0;
    int max = 0;

    for (int i = 0; i < parentheses.length; i++) {

      if (!indexes.isEmpty() && i == indexes.peekFirst()) {
        indexes.pollFirst();
        counter = 0;
      } else {
        counter++;
      }

      max = Math.max(counter, max);
    }

    return max;
  }
}
