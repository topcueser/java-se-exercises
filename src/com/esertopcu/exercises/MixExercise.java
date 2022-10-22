package com.esertopcu.exercises;

import java.util.*;

public class MixExercise {

    public static void main(String[] args) {

//        containsArray();
        sortArrays();
    }

    public static void printShapes() {

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 6; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void printShapes2() {

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 6; k >= i; k--) {
                System.out.print("$");
            }
            for (int k = 6; k >= i; k--) {
                System.out.print("$");
            }
            System.out.println();
        }
    }

    public static void sortArrays() {
        int[] numbers = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        String[] words = new String[5];
        words[0] = "Java";
        words[1] = "Python";
        words[2] = "PHP";
        words[3] = "C++";
        words[4] = "C#";

        System.out.println("Original numeric array: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted numeric array: " + Arrays.toString(numbers));

        System.out.println("Original string array: " + Arrays.toString(words));
        Arrays.sort(words);
        System.out.println("Sorted string array: " + Arrays.toString(words));
    }

    public static void containsArray() {
        int[] numbers = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456};
        String[] values = {"AB","BC","CD","AE"};
        System.out.println(Arrays.stream(numbers).anyMatch(x -> x == 1456));
    }
}
