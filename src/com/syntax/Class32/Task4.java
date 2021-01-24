package com.syntax.Class32;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task4 {
    public static void main(String[] args) {
        Set<String> countries = new TreeSet<>();
        countries.add("USA");
        countries.add("France");
        countries.add("Italy");
        countries.add("Ukraine");
        countries.add("Canada");
        System.out.println(countries);
        Iterator<String> iterator= countries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

