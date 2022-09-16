package com.betulkircil.javafundamentals;

public class Loops {
    public static void main(String[] args){
        //For loops 1
        int result;
        int[] numbers = {23, 45, 654, 23, 5, 10, -10, 0, 4};
        for(int k = 0; k< numbers.length; k++){
            result = numbers[k]*4;
            System.out.println(result);
        }
        System.out.println("\n");
        //For loops 2
        for(int number: numbers){
            System.out.println(number*4);
        }

        //While Loops
        
    }
}
