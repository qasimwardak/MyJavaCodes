package com.syntax.Class15;

public class ReplaceAll {
    public static void main(String[] args) {
        String mix="12345 6789 HELLO !@#$%^&* world";
        System.out.println(mix.replaceAll("[0-9]", ""));
        System.out.println(mix.replaceAll("[a-z]", ""));
        System.out.println(mix.replaceAll("[A-Z]", ""));
        System.out.println(mix.replaceAll("[^a-z, A-Z, 0-9]", ""));

    }
}
