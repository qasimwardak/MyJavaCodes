package com.syntax.Class15;

public class returnMethod {
    public static boolean evenNumbers (int a, int b)  {
        if (a%2==0 && b%2==0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(evenNumbers(6,4));

    }
}

