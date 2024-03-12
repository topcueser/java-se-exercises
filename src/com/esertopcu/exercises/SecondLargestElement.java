package com.esertopcu.exercises;

import java.util.Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] numbers = {1,3,5,12,4,21,3,2};

        System.out.println(returnSecondMax(numbers));

    }

    public static int returnSecondMax(int[] numbers) {

        int max = numbers[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                secondMax = max;
            }else if (numbers[i] > secondMax && numbers[i] != max) {
                secondMax = numbers[i];
            }
        }
        return secondMax;
    }

    public static int returnSecondMaxUseArraySort(int[] numbers) {
        Arrays.sort(numbers);
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] != numbers[i - 1]) {
                return numbers[i - 1];
            }
        }
        return 0;
    }
}
