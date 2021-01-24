package com.syntax.Class15;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String name="Ahmad Qasim Wardak";
        String [] array=name.split("[^A-Z]");
        System.out.println(Arrays.toString(array));
    }
}
