package com.esertopcu.exercises.leetcode;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverse(-255));
    }

    private static int reverse(int x) {

        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }

        long reverse = 0;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        if (reverse > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (isNegative ? -reverse : reverse);
    }
}
