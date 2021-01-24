package com.syntax.Class15;

public class reverseMethod {
    public static void main(String[] args) {

        String Given="Hello Friends";
        String reverse="";
        for (int i=Given.length()-1; i>=0; i--) {
            reverse+=Given.charAt(i);
        }
        System.out.println(reverse);
        System.out.println("----------------------------Another Way --------------------------------");
        String givenString = "Hello Friends";

        StringBuffer sb = new StringBuffer(givenString);
        sb.reverse();

        String reversedString=sb.toString();

        System.out.println(reversedString);

    }


}

