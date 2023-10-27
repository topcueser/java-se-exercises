package com.esertopcu.exercises.leetcode;

import java.util.HashSet;

public class ValidAnagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("a", "ab"));
    }

    private static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] charCounts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            charCounts[t.charAt(i) - 'a']--;
            if (charCounts[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
