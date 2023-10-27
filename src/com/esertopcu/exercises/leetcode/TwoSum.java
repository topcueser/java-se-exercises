package com.esertopcu.exercises.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        /*
        * Input: nums = [2,7,11,15], target = 9
        * Output: [0,1]
        * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        * */

        int[] nums = {-3,4,3,90}; // output : [0,2]
        int target = 0;

        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{0,0};
    }
}
