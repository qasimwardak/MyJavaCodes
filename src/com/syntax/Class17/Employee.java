package com.syntax.Class17;

public class Employee  {
    int empID;
    double salary;
    static String CEO;


    public static void main(String[] args) {

        Employee employee1=new Employee();
employee1.empID=123;
employee1.salary=80000.00;
Employee.CEO="Sumair";
        System.out.println(employee1.empID+" "+employee1.salary+" "+employee1.CEO);
Employee employee2=new Employee();
employee2.empID=456;
employee2.salary=100000.00;
        System.out.println(employee2.empID+" "+employee2.salary+" "+employee2.CEO);
    }
    }
