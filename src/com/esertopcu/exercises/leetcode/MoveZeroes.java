package com.esertopcu.exercises.leetcode;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] numbers = {0,1,0,3,12};
        moveZeroes(numbers);
    }

    public static void moveZeroes(int[] numbers) {

        int startPosition = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                numbers[startPosition] = numbers[i];
                startPosition++;
            }
        }

        while (startPosition < numbers.length) {
            numbers[startPosition++] = 0;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
