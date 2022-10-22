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
//        SECOND WAY
//        char[] charArray1 = new char[str.length()];
//        for (int i = 0; i < str.length(); i++){
//            charArray1[i] = str.charAt(i);
//        }

        for (char c : charArray) {
            if(mapStr.containsKey(c)) {
                mapStr.put(c, mapStr.get(c) + 1);
            }else{
                mapStr.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : mapStr.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

    }
}
