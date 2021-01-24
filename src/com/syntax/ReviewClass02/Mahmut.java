package com.syntax.ReviewClass02;

import java.util.Scanner;

public class Mahmut {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three distinct numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int largest = 0;
        if (num1 > largest) {
            largest = num1;
        }
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        System.out.println("The largest number is " + largest);

    }

}

