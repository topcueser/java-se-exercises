package com.esertopcu.exercises.leetcode;

import java.util.Arrays;

public class RotateArray {

    /*
    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
    * */

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7};
        int k = 3;
        int size = numbers.length;
        rotate(numbers, k, size);

    }

    // Time O(1)
    public static void rotate(int[] numbers, int k, int size) {
        int[] copyNumbers = new int[size];

        for(int i = 0; i < size; i++){
            copyNumbers[(i+k)%size] = numbers[i];
        }

        for(int j = 0; j < copyNumbers.length; j++){
            numbers[j] = copyNumbers[j];
        }

        System.out.println(Arrays.toString(numbers));
    }

    // Time O(nˆ2)
    public static void rotate2(int[] numbers, int k, int size) {
        for (int i = 0; i < k; i++) {
            int temp = numbers[size-1];
            System.out.println("temp: " + temp);
            for (int j = size-1; j > 0; j--){
                System.out.println("array-in: " + numbers[j-1]);
                numbers[j] = numbers[j-1];
            }
            numbers[0] = temp;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
