package com.syntax.Class17;

public class Main {

        public static void main(String[] args) {
    /*    Task1 task1=new Task1();
        String email = task1.createEmail("Ahmed", "Qasim", "Gmail");
        System.out.println(email);
        Task2 task2=new Task2();
        boolean prime = task2.isPrime(25);
        boolean prime1 = task2.isPrime(1);
        boolean prime2 = task2.isPrime(10);
        System.out.println("isPrime(25) "+prime);
        System.out.println("isPrime(1) "+prime1);
        System.out.println("isPrime(10) "+prime2);*/

/*
        Variables variables=new Variables();
        Variables var2=new Variables();
        variables.varsDemo();
        variables.varsDemo1();*/


            Student1 qasim = new Student1();
            qasim.name = "Qasim";
            qasim.age = 30;
            qasim.marks = 90;

            qasim.StudentsRegistered();
            qasim.numberOfStudentsEnrolled++;


            Student1 danilo = new Student1();

            danilo.name = "Danilo";
            danilo.age = 30;
            danilo.marks = 95;
            danilo.numberOfStudentsEnrolled++;
            danilo.StudentsRegistered();

            Student1 ilya = new Student1();
            ilya.name = "Ilya";
            ilya.age = 40;
            ilya.marks = 98;
            // ilya.numberOfStudentsEnrolled++;
            ilya.StudentsRegistered();


        }
    }

