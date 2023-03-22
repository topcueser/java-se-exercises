package com.esertopcu.exercises.hackerrank;

import java.util.Arrays;
import java.util.List;

public class DesignerPdfViewer {

    public static void main(String[] args) {

        /*
        There is a list of 26 character heights aligned by index to their letters.
        For example, 'a' is at index 0 and 'z' is at index 25.
        There will also be a string. Using the letter heights given,
        determine the area of the rectangle highlight in mm2 assuming all letters are 1mm wide.
        * */

        /*
            Example:

            1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
            abc

            We are highlighting the word abc:
            Letter heights are a = 1, b = 3, and c = 1. The tallest letter, b, is 3mm high.
            The selection area for this word is 3 x 1mm x 3mm = 9.
            Note: Recall that the width of each character is 1mm.

        * */

        String word = "abc";
        List<Integer> height = Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);

        System.out.println(designerPdfViewer(height, word));

    }

    public static int designerPdfViewer(List<Integer> h, String word) {

        int maxHeight = 0;

        for(int i = 0; i < word.length(); i++)
        {
            if(h.get(word.charAt(i) - 97) > maxHeight) {
                maxHeight = h.get(word.charAt(i) - 97);
            }
        }

        return maxHeight * word.length();
    }
}
