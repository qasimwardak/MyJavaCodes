package com.syntax.Class33;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {

       Person Qasim=new Person("Ahmad","Qasim", 30, 120000.00);
        Person Samim=new Person("Ahmad","Samim", 28, 116000.00);
        Person Tamim=new Person("Ahmad","Tamim", 26, 115000.00);
        Person Ali=new Person("Ali","Ahmad", 38, 117000.00);
        Person Omar=new Person("Mohammad","Omar", 36, 118000.00);
        Person Azim=new Person("Abdul","Azim", 42, 119000.00);
        Person Hakim=new Person("Abdul","Hakim", 50, 114000.00);

        TreeMap<Integer, Person> employees=new TreeMap<>();
        employees.put(6, Qasim);
        employees.put(4, Samim);
        employees.put(3, Tamim);
        employees.put(7, Ali);
        employees.put(5, Omar);
        employees.put(1, Azim);
        employees.put(2, Hakim);
     Set<Map.Entry<Integer, Person>> employeesset=employees.entrySet();
     Iterator<Map.Entry<Integer, Person>> iterator=employeesset.iterator();
     while (iterator.hasNext()) {
      Map.Entry<Integer, Person> next= iterator.next();
      System.out.println(next);
     }

        //System.out.println(employees);

    }

}
