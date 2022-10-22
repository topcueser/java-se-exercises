package com.esertopcu.exercises.w3resource;

import java.util.Scanner;

public class Exercise25 {

    /*
      1
     212
    32123
   4321234
  543212345
 65432123456
7654321234567
 65432123456
  543212345
   4321234
    32123
     212
      1
    * */

    public static void main(String[] args) {

//        System.out.println("Input a number: ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();

        for (int i = 1; i <= 7; i++) {
            for (int spc = 6; spc > 0; spc--) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
