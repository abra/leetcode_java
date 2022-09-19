package leetcode.problems.easy.p0009;

public class PalindromeNumber {

    public static void main(String[] args) {

        System.out.println(new Solution().isPalindrome(-101));
    }

}

//
// https://leetcode.com/problems/palindrome-number/
//
class Solution {

    public boolean isPalindrome(int x) {
        int number = x;
        if (number < 0)
            return false;

        int reversed = 0;
        while (number > 0) {
            reversed = (reversed * 10) + (number % 10);
            number = number / 10;
        }

        return x == reversed;
    }

}