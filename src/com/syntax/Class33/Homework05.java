package com.syntax.Class33;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Homework05 {
    /*
    Create a Map from array of cities that will sort keys in alphabetical order.
     As a key store the name of the city and as a value store the length of the city
     (Example: Paris=5, Moscow =6, Washington DC=13 etc..).
    If any city name is more than 7 characters remove that city .
     */
    public static void main(String[] args) {
        String[] citiesArray = {"Paris", "Moscow", "Washington DC", "Helsinki",
                "Oslo", "Berlin", "Ottawa"};


        Map<String, Integer> citiesMap = new TreeMap<>();

        for (String s : citiesArray) {
            citiesMap.put(s, s.length());
        }

        System.out.println(citiesMap);
        System.out.println("===============================");
        Iterator<Map.Entry<String,Integer>> iterator = citiesMap.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<String, Integer> element = iterator.next();
            if(element.getValue() > 7) {
                iterator.remove();
            }
        }
        System.out.println(citiesMap);
    }
}
/*
import java.util.Iterator;
import java.util.TreeMap;

public class Homework05 {
    */
/*
    Create a Map from array of cities that will sort keys in alphabetical order.
     As a key store the name of the city and as a value store the length of the city
     (Example: Paris=5, Moscow =6, Washington DC=13 etc..).
If any city name is more than 7 characters remove that city .
     *//*

    public static void main(String[] args) {
        TreeMap<String, Integer> cities = new TreeMap<>();
        cities.put("Kabul", 5);
        cities.put("Washington D.C", 14);
        cities.put("Ankara", 6);
        cities.put("Tehran", 6);
        cities.put("Delhi", 5);
        cities.put("Islamabad", 9);

        Iterator<Integer> citySize = cities.values().iterator();
        while (citySize.hasNext()) {
            if (citySize.next() > 7) {
                citySize.remove();
            }
        }
        System.out.println(cities);
    }
}*/
