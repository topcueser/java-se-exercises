package com.esertopcu.exercises;

public class PassByValue {

    private int x;
    private int y;

    public PassByValue(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {

        PassByValue testCase = new PassByValue(1, 2);
        increaseCoordinates(testCase, 2, 3);
        System.out.println("X: " + testCase.getX());
        System.out.println("Y: " + testCase.getY());

    }

    /*
    * Java her zaman "pass-by-value" olarak calisir. Method parametrelerimiz nesnelerden olussa dahi
    * referansi kopyalanarak method icerisine aktarilir. Bu sayede method icerisindeki objeyi istedigimiz
    * gibi manipule edebiliriz. Kopylanan referans, method icerisinde degistirildiginde main bloktaki obje
    * etkilenmeycektir. Cunku sadece "call stack" icerisindeki objenin degeri degistirilmis olacaktir.
    * */

    public static void increaseCoordinates(PassByValue testCase, int x, int y) {
        testCase.setX(testCase.getX() + x);
        testCase.setY(testCase.getY() + y);
        testCase = new PassByValue(0, 0);
    }
}
