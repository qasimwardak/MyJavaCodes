package com.syntax.Class19;

public class Task3Constructors {
    Task3Constructors(){
        this(1);
        System.out.println("Hi");
    }
    Task3Constructors(int x){
        this(1,2);
        System.out.println("Hello");
    }
    Task3Constructors(int x, int y){
        System.out.println("How are you");
    }

    public static void main(String[] args) {
        Task3Constructors obj=new Task3Constructors();
    }
}

