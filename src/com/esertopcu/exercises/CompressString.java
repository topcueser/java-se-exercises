package com.esertopcu.exercises;

public class CompressString {

    public static void main(String[] args) {

        String str = "wwwwaaadexxxxxxwww";

        System.out.println(compress(str));

    }

    public static String compress(String input) {

        if(input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = input.toCharArray();
        char prev = charArray[0];
        int count = 1;
        for (int i = 1; i < charArray.length; i++) {
            if(prev == charArray[i]) {
                count++;
            }else{
                stringBuilder.append(prev).append(count);
                count = 1;
                prev = charArray[i];
            }
        }
        return stringBuilder.append(prev).append(count).toString();
    }
}
