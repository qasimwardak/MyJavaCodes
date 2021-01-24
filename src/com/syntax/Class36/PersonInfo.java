package com.syntax.Class36;

import com.syntax.Class33.Person;


   public class PersonInfo {
    private String FirstName, LastName;
     private int age;
     private double Salary;
public PersonInfo(){

}
       public PersonInfo(String firstName, String lastName, int age, double salary) {
           FirstName = firstName;
           LastName = lastName;
           age = age;
           Salary = salary;
       }

       public String getFirstName() {
           return FirstName;
       }

       public void setFirstName(String firstName) {
           FirstName = firstName;
       }

       public String getLastName() {
           return LastName;
       }

       public void setLastName(String lastName) {
           LastName = lastName;
       }

       public int getAge() {
           return age;
       }

       public void setAge(int age) {
           this.age = age;
       }

       public double getSalary() {
           return Salary;
       }

       public void setSalary(double salary) {
           Salary = salary;
       }

       @Override
       public String toString() {
           return "PersonInfo{" +
                   "FirstName='" + FirstName + '\'' +
                   ", LastName='" + LastName + '\'' +
                   ", age=" + age +
                   ", Salary=" + Salary +
                   '}';
       }
   }
