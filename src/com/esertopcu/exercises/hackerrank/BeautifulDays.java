package com.esertopcu.exercises.hackerrank;

public class BeautifulDays {

    public static void main(String[] args) {

        int num = 1234567, reversed = 0;

        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);

        int startDay = 20;
        int endDay = 23;
        int divisor = 6;

        System.out.println(beautifulDays(startDay, endDay, divisor));
    }

    public static int beautifulDays(int startDay, int endDay, int divisor) {

        int answer = 0;
        for (int num = startDay; num <= endDay; num++) {

            int reverseDay = 0;
            for(;num != 0; num /= 10) {
                int digit = num % 10;
                reverseDay = reverseDay * 10 + digit;
            }

            //Math.abs(num - reverseDay) / divisor;

        }

        return 1;
    }
}
