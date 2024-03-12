package com.esertopcu.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GmailFilterEmail {

    public static void main(String[] args) {

        String[] emails = {
                "example@gmail.com",
                "user@yahoo.com",
                "anotheruser@gmail.com",
                "test@hotmail.com"
        };

        //String[] filteredEmails = filterEmails(emails);
        String[] filteredEmails = filterEmailsWithStream(emails);

        System.out.println(Arrays.toString(filteredEmails));

    }

    public static String[] filterEmails(String[] emails) {

        List<String> filteredEmails = new ArrayList<>();

        for (String email : emails) {
            if(email.endsWith("@gmail.com")) {
                filteredEmails.add(email);
            }
        }

        return filteredEmails.toArray(new String[filteredEmails.size()]);
    }

    public static String[] filterEmailsWithStream(String[] emails) {

        return Arrays.stream(emails)
                .filter(email -> email.endsWith("@gmail.com"))
                .toArray(String[]::new);
    }
}
