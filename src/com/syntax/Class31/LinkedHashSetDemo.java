package com.syntax.Class31;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

    public class LinkedHashSetDemo {
        public static void main(String[] args) {
            Set<String> LinkedHashSet=new LinkedHashSet<>();
            LinkedHashSet.add("Apple");
            LinkedHashSet.add("Mango");
            LinkedHashSet.add("Kiwi");
            LinkedHashSet.add("Apple");
            LinkedHashSet.add("strawberry");
            LinkedHashSet.add("avacado");
            LinkedHashSet.add("olives");

            System.out.println(LinkedHashSet);
        }
    }
