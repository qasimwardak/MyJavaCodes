package com.syntax.Class15;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append("World");
        String string = "Hello";
        string.concat(" World");
        System.out.println(string);
        System.out.println(stringBuilder);
        System.out.println("____________________________________________________");



        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        String upper = sb.toString().toUpperCase();

        System.out.println(upper);
    }

    }

