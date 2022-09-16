package com.betulkircil.javafundamentals;

public class ConditionalStatements {
    public static void main(String[] args){
        int sayi1 = 56;
        int sayi2 = 56;
        int sayi3 = 78;
        if(sayi1 > sayi2){
            System.out.println(sayi1 + "is greater than " + sayi2);
        }
        else if(sayi2 > sayi1){
            System.out.println(sayi2 + " is greater than " + sayi1);
        }
        else{
            System.out.println(sayi1 + " and " + sayi2 + " is equal");
        }



        //Switch blocks
        int day = 7;
        String dayString = "";
        switch (day){
            case 1:
                dayString = "Monday";
                System.out.println(dayString);
                break;
            case 2:
                dayString = "Tuesday";
                System.out.println(dayString);
                break;
            case 3:
                dayString = "Wednesday";
                System.out.println(dayString);
                break;
            case 4:
                dayString = "Thursday";
                System.out.println(dayString);
                break;
            case 5:
                dayString = "Friday";
                System.out.println(dayString);
                break;
            case 6:
                dayString = "Saturday";
                System.out.println(dayString);
                break;
            case 7:
                dayString = "Sunday";
                System.out.println(dayString);
                break;
            default:
                System.out.println("Try again");
        }

        //Kalın sesli mi ince sesli mi
        char harf = 'I';
                switch(harf){
                    case 'A':
                    case 'I':
                    case 'O':
                    case 'U':
                        System.out.println("Kalın sesli harf");
                        break;
                    default:
                        System.out.println("Ince sesli harf");
                }
    }
}
