package com.esertopcu.exercises;

public class FindDuplicates {

    public static void main(String[] args) {

        String sentence = "how many duplicates are there?";
        System.out.println(sentence);

        StringBuilder characters = new StringBuilder();
        StringBuilder duplicates = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++){
            String current = Character.toString(sentence.charAt(i));
            if (characters.toString().contains(current) && !duplicates.toString().contains(current)){
                duplicates.append(current);
            }
            characters.append(current);
        }

        System.out.println(String.join(",", duplicates.toString()));
    }
}

