package com.betulkircil.javafundamentals;

public class TypeCasting {
    public static void main(String[] args){
        /* String => int
        int => string
        double => int
        int => double
         */
        int age = 78;
        String ageStr = String.valueOf(age);    //int to string
        System.out.println(ageStr + "hello");

        String value = "5";
        int valueInt = Integer.parseInt(value);  //Integer.valueOf(string sth.);
        System.out.println(valueInt + 5);    //string to int

        int note = 95;    //int to string
        String noteString = String.valueOf(note);
        System.out.println(noteString + 5);       //955

        float floatNumber = 45.9f;
        int floatNumbertoInt = (int) floatNumber;    //float to int
        System.out.println(floatNumber);
        System.out.println(floatNumbertoInt);

        long longNumber = 353522523;
        String stringNumber = String.valueOf(longNumber);    //long to int
        System.out.println(stringNumber + 56);


        float oran = 1.8f;
        long longOran = (long) oran;
        System.out.println(longOran);
    }
}
