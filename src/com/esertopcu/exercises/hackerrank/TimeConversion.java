package com.esertopcu.exercises.hackerrank;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TimeConversion {

    public static void main(String[] args) {

        //String time1 = "12:01:00PM";
        String time1 = "07:05:45PM";
        String time2 = "12:01:00AM";

        System.out.println(timeConversion(time1));

    }

    public static String timeConversion(String timeText) {
        // Write your code here

        String timeConv = timeText.substring(0, timeText.length()-2);
        String[] timeSplit = timeConv.split(":");

        int hour = Integer.parseInt(timeSplit[0]);

        if(timeText.contains("PM") && hour < 12) {
            timeSplit[0] = String.valueOf(hour + 12);
        }

        if(timeText.contains("AM")) {
            if(hour > 12) {
                String convertTime = String.valueOf(hour - 12);
                if(convertTime.length() < 2) {
                    convertTime = "0" + convertTime;
                }
                timeSplit[0] = convertTime;
            } else if(hour == 12) {
                timeSplit[0] = "00";
            }
        }

        return String.join(":", timeSplit);

    }
}
