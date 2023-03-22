package com.esertopcu.exercises.hackerrank;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthdayCakeCandles {

    public static void main(String[] args) {

        /*
            You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age.
            They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
            Example
                candles = [4,4,1,3]
            The maximum height candles are  units high. There are  of them, so return .
	    */

        List<Integer> numbers = Stream.of(4, 4, 1, 3)
                .collect(Collectors.toList());

        System.out.println(birthdayCakeCandles(numbers));

    }

    public static int birthdayCakeCandles(List<Integer> candles) {

        Map<Integer, Integer> candlesCount = new TreeMap<>();

        for (int val : candles) {
            if(candlesCount.containsKey(val)) {
                candlesCount.put(val, candlesCount.get(val) + 1);
                continue;
            }
            candlesCount.put(val, 1);
        }

        int maxCandles = 0;
        for (Map.Entry<Integer, Integer> pair : candlesCount.entrySet()) {
            if(pair.getValue() > maxCandles) {
                maxCandles = pair.getValue();
            }
        }

        return maxCandles;
    }
}
