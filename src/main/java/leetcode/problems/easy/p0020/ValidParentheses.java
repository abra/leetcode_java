package leetcode.problems.easy.p0020;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(new Solution().isValid("(])"));      // false
        System.out.println(new Solution().isValid("()[]{}"));   // true
    }
}

//
// https://leetcode.com/problems/valid-parentheses
//
class Solution {
    public boolean isValid(String s) {
        String[] p = s.split("");
        Deque<String> stack = new ArrayDeque<>();

        for (String value : p) {
            if (value.equals("(")) {
                stack.push(value);
            } else if (value.equals("[")) {
                stack.push(value);
            } else if (value.equals("{")) {
                stack.push(value);
            } else if (value.equals(")") && Objects.equals(stack.peekFirst(), "(")) {
                stack.pop();
            } else if (value.equals("]") && Objects.equals(stack.peekFirst(), "[")) {
                stack.pop();
            } else if (value.equals("}") && Objects.equals(stack.peekFirst(), "{")) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.size() <= 0;
    }
}

