package com.syntax.Class15;

public class Replace {

    public static void main(String[] args) {

        String word = "abrakadabra";

        String replace = word.replaceAll("[^aAeEiIoOuU]", " ");

        System.out.println(replace);
    }
}
