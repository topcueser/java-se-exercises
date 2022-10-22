package com.esertopcu.exercises.leetcode;

public class ReverseCharArray {

    /*
    Input: s = ["h","e","l","l","o"]
    Output: ["o","l","l","e","h"]
    * */

    public static void main(String[] args) {
        char[] words = {'h','e','l','l','o'};
        System.out.println(words);
        char temp;
        int size = words.length;
        for (int i = 0; i < size/2; i++){
            temp = words[i];
            words[i] = words[size - i - 1];
            words[size - i - 1] = temp;
        }
        System.out.println(words);
    }
}
