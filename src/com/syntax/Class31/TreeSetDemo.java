package com.syntax.Class31;


import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetDemo {

    public static void main(String[] args) {
        Set<String> LinkedHashSet=new TreeSet<>();
        LinkedHashSet.add("Apple");
        LinkedHashSet.add("Mango");
        LinkedHashSet.add("Kiwi");
        LinkedHashSet.add("Apple");
        LinkedHashSet.add("strawberry");
        LinkedHashSet.add("avacado");
        LinkedHashSet.add("olives");

        System.out.println(LinkedHashSet);

        Set<Integer> LinkedHashSet2=new TreeSet<>();
        LinkedHashSet2.add(10);
        LinkedHashSet2.add(20);
        LinkedHashSet2.add(100);
        LinkedHashSet2.add(100);
        LinkedHashSet2.add(5);


        System.out.println(LinkedHashSet2);



    }
}
