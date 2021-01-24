package com.syntax.Class36;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int [] arr={10, 20};
        System.out.println("This will be always printed");
        try{
            System.out.println(arr[4]);
        }
        catch (ArrayIndexOutOfBoundsException array) {
            System.out.println("The array is out of index bound");
        }
        System.out.println("This will not be printed");
    }
}
