package com.esertopcu.exercises.leetcode;

import java.util.Arrays;

public class ArrayElementPlusOne {

    public static void main(String[] args) {

        /*
        Input: digits = [1,2,3]
        Output: [1,2,4]
        Explanation: The array represents the integer 123
        Incrementing by one gives 123 + 1 = 124
        Thus, the result should be [1,2,4]
        * */

        int[] digits = {1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
