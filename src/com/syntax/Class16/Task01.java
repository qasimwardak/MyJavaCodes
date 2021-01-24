package com.syntax.Class16;

public class Task01 {
    public static void main(String[] args) {
        String str1="Qasim";
        String reverse="";
        for (int i=str1.length()-1; i>=0; i--) {
            reverse += str1.charAt(i);
        }
        System.out.println(reverse);
        System.out.println("Is "+str1+" palindrome? "+reverse.equalsIgnoreCase(str1));
StringBuilder stringBuilder=new StringBuilder ("Anna");
        System.out.println(stringBuilder.reverse());
        }
    }

