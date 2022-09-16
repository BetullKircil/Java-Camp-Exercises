package com.betulkircil.javafundamentals;

public class MukemmelSayilar {
    public static void main(String[] args){
        int sayi = 8;
        int total = 0;
        for(int k = 1; k< sayi; k++){
            if(sayi%k == 0){
                total+= k;
            }
        }
        if(total == sayi){
            System.out.println("Mukemmel sayidir");
        }
        else {
            System.out.println("Mukemmel sayi degildir");
        }
    }
}
