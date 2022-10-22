package com.esertopcu.exercises;

import java.util.Scanner;

public class JavaLoops2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        // (a + 2^0 * b) + (a + 2^0 * b + 2^1 * b) ..... (a + 2^0 * b + 2^1 * b + .... + 2^(n-1)*b)

        for(int i = 0; i < count; i++){
            int firstNumber = scan.nextInt();
            int secondNumber = scan.nextInt();
            int loopCounter = scan.nextInt();

            int sum = firstNumber;
            for (int j = 0; j < loopCounter; j++){
                int nextCalc = (int) Math.pow(2, j) * secondNumber;
                sum += nextCalc;
                System.out.printf("%s ",sum);
            }

            if (i < count-1) {
                System.out.print("\n");
            }

        }
        scan.close();
    }
}
