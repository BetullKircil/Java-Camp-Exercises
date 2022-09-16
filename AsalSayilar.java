package com.betulkircil.javafundamentals;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class AsalSayilar{
    public static void main(String[] args) {
        int number = 11;
        boolean asalMi = true;
        for(int k = 2; k<number; k++){
            if(number%k == 0){
                asalMi = false;
            }
        }
        if(number >= 2){
            if(asalMi){
                System.out.println(number + " asaldir");
            }
            else{
                System.out.println(number + " asal degildir");
            }
        }
        else {
            System.out.println(number + " asal degildir");
        }
    }
}
