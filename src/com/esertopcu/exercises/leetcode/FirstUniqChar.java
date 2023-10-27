package com.esertopcu.exercises.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FirstUniqChar {

    public static void main(String[] args) {
        System.out.println(uniqChar("leetcode"));
    }

    private static int uniqChar(String s) {

        int[] frequency = new int[26];

        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;

    }
}
