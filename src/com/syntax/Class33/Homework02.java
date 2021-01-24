package com.syntax.Class33;



import java.util.Iterator;

import java.util.Set;
import java.util.TreeMap;

public class Homework02 {
    /*
  Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
     */
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Afghanistan", "Kabul");
        countries.put("USA", "Washington D.C");
        countries.put("Turkey", "Ankara");
        countries.put("India", "Delhi");
        countries.put("Pakistan", "Islamabad");
        countries.put("Iran", "Tehran");
        countries.put("France", "Paris");
        Set<String> countrynames = countries.keySet();
        System.out.println("--------------------For Each Loop--------------------------");
        for (String key : countrynames) {
            System.out.println(key);
            System.out.println(countries.get(key));
        }
        System.out.println("--------------------Iterator--------------------------");
        Iterator<String> iterator = countrynames.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " - " + countries.get(key));
        }
        System.out.println("--------------------For Each Loop Values-------------------------");
        for (String value : countrynames) {
            System.out.println(countries.get(value));
        }
        System.out.println("--------------------Iterator Values--------------------------");
        Iterator<String> iterator1 = countrynames.iterator();
        while (iterator1.hasNext()) {
            String values = iterator1.next();
            System.out.println(countries.get(values));

        }
    }
}