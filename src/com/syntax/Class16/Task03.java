package com.syntax.Class16;

public class Task03 {
    public static void printLarger(double num1, double num2) {

        if (num1 > num2) {
            System.out.println(num1 + " is larger than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is larger than " + num1);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}


