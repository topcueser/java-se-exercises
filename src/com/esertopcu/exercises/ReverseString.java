package com.esertopcu.exercises;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println("Enter a word: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if(text.isEmpty()){
            System.out.println("The entered word cannot be empty");
            return;
        }
        System.out.println("The word you entered: " + text + ", reverse: " + reverse(text));
    }

    public static String reverse(String inputString){
        StringBuilder reverseWord = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--){
            reverseWord.append(inputString.charAt(i));
        }
        return reverseWord.toString();
    }
}
