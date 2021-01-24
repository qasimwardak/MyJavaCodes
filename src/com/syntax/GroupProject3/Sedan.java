package com.syntax.GroupProject3;

public class Sedan extends Car {
    double length;
    Sedan(double length, double carPrice) {
        double calculateSalePrice;

        if (length > 20) {
            calculateSalePrice = carPrice - (carPrice * 0.05);
            System.out.println(calculateSalePrice);
        } else {
            calculateSalePrice = carPrice - (carPrice * 0.1);
            System.out.println(calculateSalePrice);
        }
    }
}