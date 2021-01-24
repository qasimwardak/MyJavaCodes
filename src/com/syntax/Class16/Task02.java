package com.syntax.Class16;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        String sentence="what did you use the most?";
        String[] stringArray=sentence.split(" ");
        System.out.println(Arrays.toString(stringArray));
        for (int i=0; i<stringArray.length; i++) {
            StringBuilder stringBuilder=new StringBuilder(stringArray[i]);
            stringArray[i]=stringBuilder.reverse().toString();

        }
        System.out.println(Arrays.toString(stringArray));
    }
}
