package com.esertopcu.exercises;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class CapitalizeTheFirstLetter {

    public static void main(String[] args) {
        String str = "eser topcu çanakkale";

        String output = Arrays.stream(str.split("\\s+"))
                .map(t -> t.substring(0,1).toUpperCase(Locale.ROOT) + t.substring(1))
                .collect(Collectors.joining(" "));

        System.out.println(output);

        System.out.println(str.substring(0,1).toUpperCase() + str.substring(1));
    }
}
