package com.kstumbaugh.typeconversion;

public class Main {

    public static void main(String[] args) {

        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result1 = byteVal;
        //Not valid: short resultsl = longVal;
        short resultsl1 = (short) longVal;

        //Not valid(long value in equation): short result2 = byteVal - longVal;
        short result2 = (short) (byteVal - longVal); //explicit cast to short

        //Not valid(floating result): long result3 = longVal - floatVal;
        float result3 = longVal - floatVal; //long can convert to float

         System.out.println("Success!");

    }
}