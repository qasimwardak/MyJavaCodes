package com.syntax.Class36;

public class Exception {
    public static void main(String[] args) {
        System.out.println("Important line of code");
        System.out.println("Noraml line of code");
        try{
            System.out.println(10/0);
        }
        catch (java.lang.Exception e) {
            System.out.println("Cant be divide by zero");
        }
        System.out.println("Important line of code");

    }
}
