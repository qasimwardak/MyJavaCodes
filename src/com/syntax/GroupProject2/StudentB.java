package com.syntax.GroupProject2;


    public class StudentB extends Marks {
        double Average;
        StudentB (double math, double chem, double syntax)
        {
            Average=(math+ chem+ syntax)/3;}
        double getPercent(){
            return Average;
        }
    }

