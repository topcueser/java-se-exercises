package com.esertopcu.exercises.airclass;

import java.io.IOException;

public class AirClassApp {

    public static void main(String[] args) {
        try {
            new AirJet();
        } catch (IOException e){
            System.out.print("IOException is thrown in AirClassApp");
        }
    }
}

