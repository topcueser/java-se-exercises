package com.esertopcu.exercises;

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {

        // Input Format
        /*The first line contains a string A.
        The second line contains another string B.
        The strings are comprised of only lowercase English letters.*/

        // Output Format
        /*
        There are three lines of output:
        For the first line, sum the lengths of A and B.
        For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
        For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
        * */

        Scanner sc = new Scanner(System.in);
        String line1String = sc.next();
        String line2String = sc.next();

        System.out.println(line1String.length() + line2String.length());
        if (line1String.compareTo(line2String) > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        String combiningText = line1String.substring(0, 1).toUpperCase() + line1String.substring(1) + " " + line2String.substring(0, 1).toUpperCase() + line2String.substring(1);
        System.out.println(combiningText);

    }
}
