package com.kstumbaugh.conditional;

public class Main {

    public static void main(String[] args) {

        /*
        relational:
            > Greater than
            >= Greater than or equal
            < Less than
            <= Less than or equal
            == Equal to
            != Not equal to
        result = condition ? true-value : false-value;
        */
        int v1 = 7;
        int v2 = 5;
        int vMax = v1 > v2 ? v1 : v2;
        System.out.println(vMax);

        /*If Else Statement
        * statements can be chained together, evaluated in order til one is true*/
        //if(condition)
        //true-statement;
        //else
            //false-statement;

        /*Block Statement - compound statement, treated as 1 statement*/
        //{
            //statement-1;
            //statement-2;
            //*
            //*
            //*
            //statement-N;
        //}
        int v3 = 10, v4 = 4, diff;
        if(v3 > v4) {
            diff = v3 - v4;
            System.out.println("V3 is bigger");
            System.out.println(diff);
        }
        else if(v4 > v3) {
            diff = v4 - v3;
            System.out.println("V4 is bigger");
            System.out.println(diff);
        }
        else
            System.out.println("v4 and v3 are equal");
    }
}
