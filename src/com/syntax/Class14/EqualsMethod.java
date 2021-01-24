package com.syntax.Class14;

public class EqualsMethod {
    public static void main(String[] args) {
        String name="Gulem";
        String name2="Gulem";
        String name3="Ayubi";
        System.out.println(name.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name.equals(name3));

        System.out.println(name==name2);
        System.out.println(name2==name3);
        System.out.println(name==name3);

    }
}
