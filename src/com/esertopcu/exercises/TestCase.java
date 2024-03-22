package com.esertopcu.exercises;

import java.util.Arrays;

public class TestCase {

    public static void main(String[] args) {

        float t,x;
        t = 25+15;
        x = t/4;

        System.out.println(x);

        // eksik olan elemani bulmak
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,17,18,19,20};
        System.out.println(((20*21) / 2) - Arrays.stream(numbers).sum());

    }
}
