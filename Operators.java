package com.betulkircil.javafundamentals;

public class Operators {
    public static void main(String[] args){
        int sayi = 5;
        System.out.println(sayi);    //5
        System.out.println(sayi++);  //5
        System.out.println(++sayi);  //7
        System.out.println(sayi);    //7

        float number1, number2;
        number1 = 4.5f;
        number2 = 6.7f;
        System.out.println(number2 > number1);  //true
        System.out.println(number1 > number2);  //false

        System.out.println(number1 == number2);  //false
        System.out.println(number1 != number2);  //true

        int not1 = 45;
        int not2 = 60;
        int not3 = 75;
        System.out.println(not1 < not2 && not2 < not3);  //true
        System.out.println(not1 < not2 || not3 < not2);  //false
    }
}
