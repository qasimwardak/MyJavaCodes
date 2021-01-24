package com.syntax.Class17;

public class Student {
    String studentName;
    int studentID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Student student1=new Student();
        student1.studentName="Qasim";
        student1.studentID=123;
        Student.numberOfStudents++;
        System.out.println(student1.studentName);
        System.out.println(student1.studentID);
        System.out.println(Student.numberOfStudents);
        Student student2=new Student();
        student2.studentName="Samim";
        student2.studentID=456;
        student2.numberOfStudents++;
        System.out.println(student2.studentName);
        System.out.println(student2.studentID);
        System.out.println(Student.numberOfStudents);
        Student student3=new Student();
        student3.studentName="Tamim";
        student3.studentID=123;
        student3.numberOfStudents++;
        System.out.println(numberOfStudents);
        System.out.println(student3.studentName);
        System.out.println(student3.studentID);
        System.out.println(Student.numberOfStudents);
    }
}
