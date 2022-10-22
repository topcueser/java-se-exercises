package com.esertopcu.exercises.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /*
    Input: nums = [1,2,3,1]
    Output: true
    * */

    public static void main(String[] args) {

        int[] numbers = {1,2,3,1};
        System.out.println(containsDuplicate2(numbers));
    }

    // Time O(1)
    public static boolean containsDuplicate(int[] numbers) {
        Arrays.sort(numbers);
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] == numbers[i+1]) {
                return true;
            }
        }
        return false;
    }

    // Time O(1)
    public static boolean containsDuplicate2(int[] numbers) {
        Set<Integer> numberSet = new HashSet<>();
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numberSet.contains(numbers[i])) {
                return true;
            }
            numberSet.add(numbers[i]);
        }
        return false;
    }

    // Time O(nˆ2)
    public static boolean containsDuplicate3(int[] numbers) {
        for (int i = 0; i <= numbers.length - 1; i++) {
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
