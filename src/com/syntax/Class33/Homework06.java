package com.syntax.Class33;


import java.util.*;

public class Homework06 {

    /*
    Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format
     John Smith=$100000
     */
    public static void main(String[] args) {

        Map<String, Double> employees= new HashMap<>();
        employees.put("Azim", 100000.00);
        employees.put("Omar", 95000.00);
        employees.put("Ali", 90000.00);
        employees.put("Qasim", 100000.00);
        employees.put("Samim", 80000.00);
        employees.put("Tamim", 75000.00);
        employees.put("Halim", 100000.00);

        Set<Map.Entry<String, Double>> employeeSet= employees.entrySet();
        Iterator<Map.Entry<String, Double>> iterator= employeeSet.iterator();
        Map.Entry<String, Double> MaxSalary= null;
        for (Map.Entry<String, Double> entry : employees.entrySet()) {
          if (MaxSalary==null || entry.getValue().compareTo(MaxSalary.getValue())>0) {
              MaxSalary=entry;
            }
        }
        System.out.println(MaxSalary.getKey()+" has the highest Salary = $"+MaxSalary.getValue()+" annually");
    }
}


/*import java.text.NumberFormat;
        import java.util.HashMap;
        import java.util.Iterator;
        import java.util.LinkedHashMap;
        import java.util.Map;

public class Task6 {

    *//*
    Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format
    John Smith=$100000
     *//*

    public static void main(String[] args) {
        Map<String, Integer> employeeMap = new LinkedHashMap<>();
        employeeMap.put("Skywalker", 150_000);
        employeeMap.put("Kenobi", 175_000);
        employeeMap.put( "Palpatine", 999_999);
        employeeMap.put("Mike", 1_000_000);
        employeeMap.put("Solo", 1_000_000);
        employeeMap.put("Leia", 671_000);
        System.out.println(employeeMap);
        Iterator<Map.Entry<String, Integer>> iterator = employeeMap.entrySet().iterator();

        int highestSalary = 0;

        Map<String,Integer> heighestSalaryMap=new HashMap<>();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            if (next.getValue() > highestSalary) {
                highestSalary = next.getValue();
            }
        }

        for (Map.Entry<String, Integer> originalMap:employeeMap.entrySet()
        ) {
            if(originalMap.getValue()==highestSalary){
                heighestSalaryMap.put(originalMap.getKey(),originalMap.getValue());
            }

        }

        for (Map.Entry<String, Integer> var:heighestSalaryMap.entrySet()

        ) {
            System.out.println(var.getKey()+" $"+var.getValue());
        }
    }
}*/
