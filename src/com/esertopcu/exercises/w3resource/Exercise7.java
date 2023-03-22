package com.esertopcu.exercises.w3resource;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        System.out.println("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }

    }
}
