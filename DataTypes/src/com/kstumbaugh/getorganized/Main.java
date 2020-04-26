package com.kstumbaugh.getorganized;

public class Main {

    public static void main(String[] args) {
        //compound Assignment
        int myVal = 50;
        myVal -= 5;
        myVal += 5;
        System.out.println(myVal);

        int result = 100;
        int val1 = 5;
        int val2 = 10;
        result /= val1  * val2;
        System.out.println(result);

        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - valB / valC;
        int result2 = (valA - valB) / valC;

        System.out.println(result2);
        System.out.println(result1);

        int result3 = valA / valC * valD + valB;
        int result4 = valA / (valC * (valD + valB));
        System.out.println(result3);
        System.out.println(result4);

        //implicit - widening
        //explicit - widening or narrowing, use caution

    }
}

