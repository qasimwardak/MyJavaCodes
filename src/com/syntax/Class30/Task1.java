package com.syntax.Class30;

import java.util.ArrayList;

public class Task1 {
//    Create an java.util.ArrayList that will store 5 names into it.
//    Find out whether the given ArrayList is empty or not?
//    Check whether the specific name is present in an ArrayList or not?
//    Find the size of your arrayList and print all values from that
public static void main(String[] args) {


    ArrayList<String> namesArray = new ArrayList<>();
    namesArray.add("Qasim");
    namesArray.add("Tamim");
    namesArray.add("Samim");
    namesArray.add("Nasim");
    namesArray.add("Hasim");
    System.out.println(namesArray.isEmpty());
    System.out.println(namesArray.contains("Omar"));
    System.out.println(namesArray.size());
    System.out.println(namesArray);
}
}
