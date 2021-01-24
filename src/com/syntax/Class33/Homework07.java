package com.syntax.Class33;


/*import java.util.LinkedHashSet;

public class Homework07 {

    *//*
    Create the collection that will store single uniques Objects of a String type in which order is preserved.
    Write a logic to concatenate all string from the collection.
     *//*

    public static String wordsConcat(LinkedHashSet<String> setik) {
        String longWord = "";
        for (String word : setik) {
            longWord = longWord + word;
        }
        return longWord;
    }

    public static void main(String[] args) {
        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("Hello");
        words.add("my");
        words.add("name");
        words.add("is");
        words.add("Denis");
        System.out.println(wordsConcat(words));
    }
}*/


import java.util.HashSet;
import java.util.LinkedHashSet;

public class Homework07 {

/*
    Create the collection that will store single uniques Objects of a String type in which order is preserved.
     */

    public static void main(String[] args) {
        HashSet<String> names = new LinkedHashSet<>();
        names.add("Qasim");
        names.add("Samim");
        names.add("Tamim");
        names.add("Nasim");
        names.add("Fahim");
        System.out.println(names);
        System.out.println("---------------------Concatenation------------------------");

/*
Write a logic to concatenate all string from the collection.
 */

        names.addAll(names);
        System.out.println(names);
        }
    }

