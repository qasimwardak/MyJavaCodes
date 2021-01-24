package com.syntax.GroupProject2;


    public class StudentA extends Marks {
        double Average;
        StudentA(double math, double chem, double syntax){
            Average=(math+ chem+ syntax)/3;}
        double getPercent(){
            return Average;}
    }

