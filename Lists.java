package com.betulkircil.javafundamentals;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args){
        //Lists are used in java programming for the same duty as arrays, but lists is more flexiable. Because we usually use lists when we don't know how many elements we have.
        ArrayList<String> names = new ArrayList<>();
        names.add("Betul Kircil");
        names.add("Esma Nur");
        names.add("Feride");
        names.add(2, "Mehmet");  //we use "add" to add data to lists
        System.out.println(names);

        names.remove("Esma Nur"); //we use "remove" method to remove a data
        System.out.println(names);

        System.out.println(names.size());  // we can find out the size of lists
    }
}
