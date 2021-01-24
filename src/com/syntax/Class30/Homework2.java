package com.syntax.Class30;

import java.util.ArrayList;

public class Homework2 {

    //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
    public static void main(String[] args) {

        ArrayList<String> Drinks=new ArrayList<>();
        Drinks.add("Pepsi");
        Drinks.add("Coke");
        Drinks.add("Fanta");
        Drinks.add("Sprite");
        Drinks.add("Dew");
        for(int i=0; i<Drinks.size(); i++){
            if(Drinks.get(i).contains("a")||Drinks.get(i).contains("e"))
                Drinks.set(i, "water");
        }
        System.out.println(Drinks.toString()+", ");

    }

}
