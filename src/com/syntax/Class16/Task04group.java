package com.syntax.Class16;

public class Task04group {
    public static void main(String[] args) {
        String a = "Happy";
        String b = "Halloween";
        System.out.println("Before swap: " + a + " " + b);
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("After : " + a + " " + b);

        System.out.println("---------------another way---------------------");
        String c = "Happy";
        String d = "Halloween";
        System.out.println(d+" "+c);

    }
}
