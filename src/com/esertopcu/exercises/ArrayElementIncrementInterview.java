package com.esertopcu.exercises;

public class ArrayElementIncrementInterview {

    public static void main(String[] args) {
        int[] numbers = {1};
        ArrayElementIncrementInterview arrElementInc = new ArrayElementIncrementInterview();
        arrElementInc.increment(numbers);
        System.out.println(numbers[numbers.length - 1]);
    }

    void increment(int[] numbers) {
        numbers[numbers.length - 1]++;
    }
}
