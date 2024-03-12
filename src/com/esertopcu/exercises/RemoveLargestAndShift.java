package com.esertopcu.exercises;

import java.util.Arrays;

public class RemoveLargestAndShift {

    public static void main(String[] args) {

        int[] numbers = {4, 11, 3, 6, 8, 9};
        numbers = removeLargestAndShift(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    private static int[] removeLargestAndShift(int[] numbers) {

        int largestIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > numbers[largestIndex]) {
                largestIndex = i;
            }
        }

        for (int i = largestIndex; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        numbers[numbers.length - 1] = 0;

        return numbers;
    }
}
