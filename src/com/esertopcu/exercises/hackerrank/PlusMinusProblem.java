package com.esertopcu.exercises.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlusMinusProblem {

    public static void main(String[] args) {

        //Integer[] numbers2 = {-4, 3, -9, 0, 4, 1};
        //List<Integer> numbers3 = Arrays.asList(-4, 3, -9, 0, 4, 1);

        //List<Integer> numberList = Stream.of(-4, 3, -9, 0, 4, 1)
        //        .collect(Collectors.toList());

        List<Integer> numbers = Arrays.asList(-4, 3, -9, 0, 4, 1);
        plusMinus(numbers);
    }

    public static void plusMinus(List<Integer> numbers) {

        int positive = 0, negative = 0, zeros = 0;

        for (Integer number : numbers) {
            if(number > 0) {
                positive++;
            } else if(number < 0) {
                negative++;
            } else {
                zeros++;
            }
        }

        float divPositive = (float) positive / numbers.size();
        float divNegative = (float) negative / numbers.size();
        float divZeros = (float) zeros / numbers.size();

        System.out.println(divPositive);
        System.out.println(divNegative);
        System.out.println(divZeros);

    }
}
