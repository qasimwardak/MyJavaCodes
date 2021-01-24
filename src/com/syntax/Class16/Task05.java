package com.syntax.Class16;

public class Task05 {
    public static void ifPalindrome (String sentence) {
        int i=0;
        int j=sentence.length()-1;
        while (i<j) {
            if (sentence.charAt(i) != sentence.charAt(j)) {
                System.out.println("String is not Palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("String is a Palindrome");
        }

}


