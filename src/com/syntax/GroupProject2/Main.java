package com.syntax.GroupProject2;

public class Main {

        public static void main(String[] args) {
            Marks obj_1=new StudentA(90,95,68);
            System.out.println("Avg percent of student B : "+obj_1.getPercent());
            Marks obj_2=new StudentB(50,80,98);
            System.out.println("Avg percent of student B : " + obj_2.getPercent());
        }
    }

