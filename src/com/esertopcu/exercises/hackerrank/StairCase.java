package com.esertopcu.exercises.hackerrank;

public class StairCase {

    public static void main(String[] args) {
        stairCaseLeft(6);
        stairCaseRight(6);
    }

    /*

    #
    ##
    ###
    ####
    #####
    ######

    * */

    public static void stairCaseLeft(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    /*

         #
        ##
       ###
      ####
     #####
    ######

    * */

    public static void stairCaseRight(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = n; k >= i; k--) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
