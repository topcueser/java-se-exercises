package com.esertopcu.exercises.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

        /*
        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        Output: [4,9]
        Explanation: [9,4] is also accepted.
        * */

        int[] numbers1 = {4,9,5}; // sort : 4,5,9
        int[] numbers2 = {9,4,9,8,4}; // sort : 4,4,8,9,9

        System.out.println(Arrays.toString(intersect(numbers1, numbers2)));

    }

    public static int[] intersect(int[] numbers1, int[] numbers2) {
        Arrays.sort(numbers1);
        Arrays.sort(numbers2);

        List<Integer> numberList = new ArrayList<>();

        int i = 0, j = 0;
        while (i < numbers1.length && j < numbers2.length) {
            if (numbers1[i] < numbers2[j]) {
                i++;
            }else if (numbers1[i] > numbers2[j]) {
                j++;
            }else {
                numberList.add(numbers1[i]);
                i++;
                j++;
            }
        }

        int[] output = new int[numberList.size()];
        int k = 0;
        while(k < numberList.size()){
            output[k] = numberList.get(k);
            k++;
        }
        return output;

    }
}
