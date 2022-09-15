package leetcode.problems.easy.p0001;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(new Solution().twoSum(nums, 9)));
    }
}

class Solution {

    public int[] twoSum(int[] nums, int target) {

        if (nums.length > 1) {
            for (int i = 0; i <= nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }

        return nums;
    }
}

