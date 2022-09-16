package com.betulkircil.javafundamentals;

public class TheGreatestNumber {
    public static void main(String[] args) {
        int number1 = 273;
        int number2 = 89;
        int number3 = 233;

      /*  if(number1 >number2 && number1 > number3){
            System.out.println("The greatest number: " + number1);
        }
        if(number2 > number3 && number2 >number1){
            System.out.println("The greatest number: " + number2);
        }
        if(number3 >number2 && number3 >number1){
            System.out.println("The greatest number: " + number3);
        }
        if(number1 == number2){
            System.out.println("Number1 and number1 is equal");
            }
        if(number1 == number3){
            System.out.println("Number1 and number3 is equal");
            }
        if(number2 == number3){
            System.out.println("Number2 and number3 is equal");
            }*/

        //Loop ile
        int max = number1;
        if(max < number2){
            max = number2;
        }
        if(max < number3){
            max = number3;
        }
        System.out.println(max);
    }
}
