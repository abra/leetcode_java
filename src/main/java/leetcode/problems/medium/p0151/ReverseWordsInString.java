package leetcode.problems.medium.p0151;

public class ReverseWordsInString {
    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords("the sky is blue"));
    }
}

class Solution {
    public String reverseWords(String s) {

        s = s.trim();

        String[] array = s.split("\\s+");

        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            String tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }

        return String.join(" ", array);
    }
}
