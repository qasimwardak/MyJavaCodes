package com.syntax.Class32;


import java.util.ArrayList;

public class FlowerTester {
    public static void main(String[] args) {

        ArrayList<Flower> flowerArrayList=new ArrayList<>();
        SunFlower sunFlower = new SunFlower("Sunflower", "Yellow");
        flowerArrayList.add(sunFlower);
        flowerArrayList.add(new Tulip("Tulip","Red"));
        flowerArrayList.add(new Rose("Rose","Pink"));

        for (Flower flower:flowerArrayList
        ) {
            System.out.println("Name "+flower.name+" Color "+flower.color);
            flower.bloom();
            System.out.println();
        }

    }
}