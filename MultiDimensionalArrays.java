package com.betulkircil.javafundamentals;

public class MultiDimensionalArrays {
    public static void main(String[] args){
        String[][] cities = new String[][]{{"Mugla", "Antalya", "Izmir"}, {"Ankara", "Konya", "Aksaray"}, {"Istanbul", "Bursa", "Kocaeli"}};

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.println(cities[i][j]);
            }
            System.out.println("*******************");
        }
    }
}
