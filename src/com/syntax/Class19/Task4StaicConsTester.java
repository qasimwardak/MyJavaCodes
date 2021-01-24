package com.syntax.Class19;

public class Task4StaicConsTester {
    public static void main(String[] args) {


        Task4StaicCons task4StaicCons1 = new Task4StaicCons(Task4StaicCons.RegNumber++,
                Task4StaicCons.SchoolName="Mason", "Qasim",3.9);
        System.out.println(Task4StaicCons.RegNumber+" "+Task4StaicCons.SchoolName+" "+
                task4StaicCons1.Name+" "+task4StaicCons1.GPA);
        Task4StaicCons task4StaicCons2 = new Task4StaicCons(Task4StaicCons.RegNumber++,
                Task4StaicCons.SchoolName, "Samim",3.8);
        System.out.println(Task4StaicCons.RegNumber+" "+Task4StaicCons.SchoolName+" "+
                task4StaicCons2.Name+" "+task4StaicCons2.GPA);
        Task4StaicCons task4StaicCons3 = new Task4StaicCons(Task4StaicCons.RegNumber++,
                Task4StaicCons.SchoolName, "Tamim",3.7);
        System.out.println(Task4StaicCons.RegNumber+" "+Task4StaicCons.SchoolName+" "+
                task4StaicCons3.Name+" "+task4StaicCons3.GPA);
    }

}
