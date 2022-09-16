package com.betulkircil.javafundamentals;

import java.util.Locale;

public class Strings {
    public static void main(String[] args){
        String name = "Betul";
        //eleman sayisi:
        System.out.println(name.length());  //5

        //belli indexteki karakter
        System.out.println(name.charAt(2));   //t

        //metinleri birlestirmek icin { concat() metodu kullanılır
        String lastName = "Kırçıl";
        name = name.concat(lastName);
        System.out.println(name);

        System.out.println(name.startsWith("B")); //true
        System.out.println(name.startsWith("b"));  //false

        System.out.println(lastName.endsWith("l"));  //true

        char[] karakterler = new char[10];
        name.getChars(0,5, karakterler, 0);
        System.out.println(karakterler);

        System.out.println(name.indexOf("l"));

        String newName = name.replace("e", "a");
        System.out.println(newName);

        System.out.println(name.substring(2));
        System.out.println(name.substring(0, 3));

        String cumle = "Bugun hava cok guzel";
        for(String kelime:cumle.split(" ")){
            System.out.println(kelime);
        }

        String upperCase = cumle.toUpperCase();
        String lowerCase = cumle.toLowerCase(Locale.ROOT);

        System.out.println(upperCase);
        System.out.println(lowerCase);


        String boslukluCumle = "      Betul Kircil     ";
        System.out.println(boslukluCumle);
        System.out.println(boslukluCumle.trim());
     }
}
