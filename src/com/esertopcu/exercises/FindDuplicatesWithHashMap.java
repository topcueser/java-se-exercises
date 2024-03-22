package com.esertopcu.exercises;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesWithHashMap {

    public static void main(String[] args) {
        String str = "How many duplicates are there?";
        countDuplicateCharacters(str);
    }

    public static void countDuplicateCharacters(String str) {

        Map<Character, Integer> mapStr = new HashMap<>();

        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            mapStr.put(c, mapStr.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : mapStr.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

    }
}
