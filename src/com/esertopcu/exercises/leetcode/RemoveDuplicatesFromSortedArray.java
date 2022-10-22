package com.esertopcu.exercises.leetcode;

public class RemoveDuplicatesFromSortedArray {

    /*
    Input: nums = [0,0,1,1,1,2,2,3,3,4]
    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
    It does not matter what you leave beyond the returned k (hence they are underscores).
    * */

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }

        nums[j++] = nums[nums.length - 1];
        return j;
    }


}
