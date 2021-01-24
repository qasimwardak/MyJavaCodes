package com.syntax.ReviewClass02;

public class IfElseConditions {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*
         * System.out.println("This will be printed always");
         *
         * if(a>0) {
         *
         * System.out.println("Number is greater than zero"); }
         *
         * System.out.println("This will be printed always");
         */
        /*
         * int a = 0; System.out.println("This will be printed always"); if (a > 0) {
         * System.out.println("Number is greater than zero"); } else {
         * System.out.println("Number is greater less than zero"); }
         *
         * System.out.println("This will be printed always");
         */

        int a = 0;
        System.out.println("This will be printed always");
        if (a > 0) {
            System.out.println("Number is greater than zero");
        } else if (a < 0) {
            System.out.println("Number is greater less than zero");
        }else {
            System.out.println("Number is zero");

        }

        System.out.println("This will be printed always");

    }

}


