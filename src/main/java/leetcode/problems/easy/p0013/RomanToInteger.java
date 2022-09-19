package leetcode.problems.easy.p0013;

import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("IV"));      // 4
        System.out.println(new Solution().romanToInt("VI"));      // 6
        System.out.println(new Solution().romanToInt("LVIII"));   // 58
        System.out.println(new Solution().romanToInt("MCMXCIV")); // 1994
    }

}

//
// https://leetcode.com/problems/roman-to-integer/submissions/
//
class Solution {

    private static final Map<String, Integer> dict = Map.of(
            "I", 1,
            "V", 5,
            "X", 10,
            "L", 50,
            "C", 100,
            "D", 500,
            "M", 1000
    );

    public int romanToInt(String s) {

        String[] l = s.split("");
        int[] numbers = new int[l.length];

        for (int i = 0; i < l.length; i++) {
            numbers[i] = dict.get(l[i]);
        }

        int sum = 0;

        for (int j = numbers.length - 1; j >= 0; ) {
            if (j - 1 >= 0 && numbers[j] > numbers[j - 1]) {
                sum += numbers[j] - numbers[j - 1];
                j -= 2;
            } else if (j - 1 >= 0 && numbers[j] == numbers[j - 1]) {
                sum += numbers[j] + numbers[j];
                j -= 2;
            } else {
                sum += numbers[j];
                j--;
            }
        }

        return sum;
    }
}
