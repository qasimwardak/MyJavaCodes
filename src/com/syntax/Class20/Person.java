package com.syntax.Class20;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Person {

    String name;
    String Address;
    int age;
    String phone;
    String SSN;
    char gender;
    char maritalStatus;
    double height;
    double weight;
    int numberOfKids;
    double salary;
    String education;

    Person() {
        System.out.println("Important Line");
        System.out.println("Important Line");
    }


    Person(String name, int age, String phone, double salary){

        this();
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.salary=salary;
    }
    Person(String name, int age, String phone, double salary, char maritalStatus, int numberOfKids){
//        this.name=name;
//        this.age=age;
//        this.phone=phone;
//        this.salary=salary;
        this();
        //this(name, age, phone, salary);
        this.maritalStatus=maritalStatus;
        this.numberOfKids=numberOfKids;

    }
    Person(String name, int age, String phone, double salary, char maritalStatus, int numberOfKids, String education){
//        this.name=name;
//        this.age=age;
//        this.phone=phone;
//        this.salary=salary;
//        this.maritalStatus=maritalStatus;
//        this.numberOfKids=numberOfKids;
        this();
        //this(name, age, phone, salary, maritalStatus, numberOfKids);
        this.education=education;

    }
    Person(String name, int age, String phone, double salary, char maritalStatus, int numberOfKids, String education, double height){
        /*
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.salary=salary;
        this.maritalStatus=maritalStatus;
        this.numberOfKids=numberOfKids;
        this.education=education;
         */
        this();
        //this(name, age, phone, salary, maritalStatus, numberOfKids, education);
        this.height=height;
    }
    void print() {
        System.out.println(name+age+phone+salary+maritalStatus+numberOfKids+education+height);
    }

    public static void main(String[] args) {
        Person person=new Person("Qasim", 30, "1234567890", 90000.00,
                'M', 0, "Degree", 5.4);
        Person person2=new Person("Qasim", 30, "1234567890", 90000.00);
person.print();
person2.print();
    }

}
