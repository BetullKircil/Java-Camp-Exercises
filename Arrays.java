package com.betulkircil.javafundamentals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args){
       //In the Java Programming language, arrays are used to store some data in a few kinda variable types. We cannot describe an variable for each data, such as students in a class or notes a student had. Like these many datas we should use Arrays.
        // For instance, int, string or double datas can be stored in it. Arrays are reference types used in Java. That's why, we have to use "new" keyword to declare an array.

        //Names of the students in a class
        String[] names = new String[5]; //Just because arrays are reference types, we need to create new array in heap memory.
        names[0] = "Betul";
        names[1] = "Ayse";
        names[2] = "Fatma";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        //The index of arrays starts from 0
        //Arrays can be describe in two ways. The first one is above. The second one is below...
        //The notes that a student have at school
        int[] notes = {45, 89, 50};  //We can directly write the elements of the array without describing the number of the data in the array.
        System.out.println(notes); //If we do like this, then we see the address of the array in the memory.
        System.out.println(notes[0]);
        System.out.println(notes[1]);
        System.out.println(notes[2]);


        //HashSets, are similar to lists or arrays, but there is a small difference between them. HashSets have a item for the only one time. So, a element can be located in a hashSet for onl one time.
        HashSet<String> mySet = new HashSet<String>();
        mySet.add("Betul");
        mySet.add("Betul");
        mySet.add("Betul");
        mySet.add("Ayse");
        System.out.println(mySet.size());  //2, not 4

        //HashMaps, are used as key, value. Before using these types, we should import necessary libraries.
        HashMap<String, String> myMap = new HashMap<String, String>();
        myMap.put("Kalem", "Pencil");  //to add a new key, value, we need to use "put" keyoword.
        myMap.put("Pencere", "Window");
        myMap.put("Kitap", "Book");
        System.out.println(myMap.get("Pencere"));
        System.out.println(myMap.get("Kalem"));
        System.out.println(myMap.get("Kitap"));

        HashMap<String, Integer> students = new HashMap<>();
        students.put("Betul", 90);
        students.put("Ayse", 90);
        students.put("Mehmet", 80);
        System.out.println(students.get("Mehmet"));

       // max number with arrays
        int[] notlar = new int[]{34, 56, 78, 99, 67};
        int max = 0;
        int total = 0;
        for(int not:notlar){
            if(not > max){
                max = not;
            }
            total += not;
        }
        System.out.println(max);
        System.out.println("Total:" + total);


    }
}
