package com.esertopcu.exercises;

public class NumberIsPerfect {

    public static void main(String[] args) {
        System.out.println(isPerfect(28));
    }

    public static String isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return (sum == num) ? "number is perfect" : "number is not perfect";
    }
}
