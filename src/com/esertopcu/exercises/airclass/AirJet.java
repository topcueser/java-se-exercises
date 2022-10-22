package com.esertopcu.exercises.airclass;

import java.io.IOException;

public class AirJet extends AirPlane{

    public AirJet() throws IOException {
         super(); // direk bu sekilde ilk once yapilmalidir.
//        try {
//            super();
//        } catch (IOException e){
//            System.out.print("IOException is thrown in AirJet");
//        }
        // BU SEKILDE BIR TANIMLAMA HATALIDIR. super() her zaman ilk basta yapilmalidir.
    }
}
