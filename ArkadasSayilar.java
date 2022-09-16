package com.betulkircil.javafundamentals;

public class ArkadasSayilar {
    public static void main(String[] args){

        int number1 = 229, number2 = 284, toplam1 = 0, toplam2 = 0;
        for(int k = 1; k< number1; k++){
            if(number1%k == 0){
                toplam1+= k;
            }
        }
        for(int k = 1; k<number2; k++){
            if(number2%k == 0){
                toplam2+= k;
            }
        }
        if(toplam1 == number2 && toplam2 == number1){
            System.out.println("Arkadas sayilar");
        }
        else{
            System.out.println("Arkadas sayi degiller");
        }
    }
}
