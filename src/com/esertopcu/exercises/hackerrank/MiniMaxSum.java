package com.esertopcu.exercises.hackerrank;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MiniMaxSum {

    public static void main(String[] args) {

        /*
        * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
        * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
        * */

        //List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);

        List<Integer> numbers = Stream.of(1, 3, 5, 7, 9)
                .collect(Collectors.toList());


        List<Integer> numbers2 = Stream.of(256741038, 623958417, 467905213, 714532089, 938071625)
                .collect(Collectors.toList());

        List<Integer> numbers3 = Stream.of(140638725, 436257910, 953274816, 734065819, 362748590)
                .collect(Collectors.toList());

        miniMaxSum(numbers3);

    }

    public static void miniMaxSum(List<Integer> arr) {

        BigInteger[] result = new BigInteger[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            BigInteger sum = new BigInteger(String.valueOf(0));
            for (int j = 0; j < arr.size(); j++) {
                if(j == i) {
                    continue;
                }
                sum = sum.add(new BigInteger(String.valueOf(arr.get(j))));
            }
            result[i] = sum;
        }

        Arrays.sort(result);

        System.out.println(Arrays.toString(result));
        System.out.println(result[0] + " " + result[arr.size() - 1]);
    }
}
