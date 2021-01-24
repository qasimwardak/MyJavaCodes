package com.syntax.Class15;

public class Task04 {
    public static void main(String[] args) {
        String sentence="12234 Hello @#$&*";
        System.out.println(sentence.replaceAll("[^0-9]", "").length());
        System.out.println("-------------------another way--------------------");

    }
}
