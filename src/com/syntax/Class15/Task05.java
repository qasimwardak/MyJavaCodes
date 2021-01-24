package com.syntax.Class15;

public class Task05 {
    public static void main(String[] args) {
        String a="Is it saturday?Is it raining? Do we have a Java Class today?";
        System.out.println(a.replaceAll("[\\sa-zA-Z0-9]", "").length());
    }

}
