package com.syntax.GroupProject3;

public class Truck extends Car {

    Truck(double weight, double carPrice) {
        double calculateSalePrice;

        if (weight > 2000) {
            calculateSalePrice = carPrice - (carPrice *0.1);
            System.out.println(calculateSalePrice);
        } else {
            calculateSalePrice = carPrice - (carPrice *0.2);
            System.out.println(calculateSalePrice);
        }
    }
}