package com.esertopcu.exercises.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {

        /*
        Example 1
        Input: nums = [2,2,1]
        Output: 1

        Example 2
        Input: nums = [4,1,2,1,2]
        Output: 4
        * */

        int[] numbers = {2,2,1};
        int[] numbers2 = {4,1,2,1,2};

        System.out.println(singleNumber1(numbers2));

    }

    public static int singleNumber1(int[] numbers) {

        if (numbers.length == 1) {
            return numbers[0];
        }

        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i+=2) {
            if(numbers[i] != numbers[i+1]) {
                return numbers[i];
            }
        }
        return numbers[numbers.length - 1];
    }

    public static int singleNumber2(int[] numbers) {

        if (numbers.length == 1) {
            return numbers[0];
        }

        HashMap<Integer, Integer> mapNumber = new HashMap<>();
        for (int num : numbers) {
            if (mapNumber.containsKey(num)){
                mapNumber.put(num, mapNumber.get(num) + 1);
                continue;
            }
            mapNumber.put(num, 1);
        }

        for (Map.Entry<Integer, Integer> mapInt : mapNumber.entrySet()){
            if (mapInt.getValue() == 1){
                return mapInt.getKey();
            }
        }
        return 0;
    }

    public static int singleNumber3(int[] numbers) {
        int result = 0;
        for (int num : numbers){
            System.out.println(result + " - " + num + " = " + (result ^ num));
            result = result ^ num;
        }
        return result;
    }
}
