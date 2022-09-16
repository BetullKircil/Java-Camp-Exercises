package com.betulkircil.javafundamentals;

import java.util.Locale;

public class Variables {
    public static void main(String[] args){
        //Variables are used to store, change and access the data while programs running, and there are a few data variables type to describe them.
        //String Variables, string variables are used to store char arrays, like names of people, city or something else.
        String firstName = "Betul";
        String lastName = "Kircil";
        System.out.println("My name is " + firstName+ " " + lastName);

        System.out.println(firstName.toUpperCase());   //to change the string data to upper case
        System.out.println(lastName.toLowerCase(Locale.ROOT));  //to change the string data to lower case

        //int, long: these types are used for number, long length numbers.
        int age = 20;
        System.out.println("I am " + age + "years old");

        //double, float types: are used for store float numbers, but double is more inclusive for float numbers. While using float number, we need to add "f" to the end of the number.
        float average = 5.6f;
        double maxAAverage = 45.3876837;
        System.out.println(average);
        System.out.println(maxAAverage);

        byte number1 = -128;
        byte number2 = 127;   //Byte data type keeps int numbers between -128 and 127;

        long longNumber = 1913828749;  //we need another data type which is long for longer int types.


        //PRIMITIVE TYPES: char, boolean, int, float, long, short, byte, double.

        char character = 'B';
        char character2 = 'e';
        char character3 = 't';
        char character4 = 'u';
        char character5 = 'l';

        System.out.println(character);
        System.out.println(character2);
        System.out.println(character3);
        System.out.println(character4);
        System.out.println(character5);

        boolean isTrue = true;
        boolean isYoung = false;
    }
}
