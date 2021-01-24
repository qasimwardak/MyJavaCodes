package com.syntax.Class30;
import java.util.ArrayList;
import java.util.Iterator;

public class Homework1 {

    //Create an arraylist of cars and retrieve all the values using 3 different ways.

    public static void main(String[] args) {
        ArrayList<String> Cars = new ArrayList<>();
        Cars.add("Mercedez Benz");
        Cars.add("BMW");
        Cars.add("Audi");
        Cars.add("Range Rover");
        Cars.add("Tesla");
        System.out.println(Cars);

        System.out.println("----------------------Using Enhanced for Loop---------------------------");
        for (String car: Cars) {
            System.out.print(car + ", ");
        }
        System.out.println();
            System.out.println("----------------------Using for Loop---------------------------");

            for (int i=0; i<Cars.size(); i++) {
                System.out.print(Cars.get(i)+", ");
            }
        System.out.println();
        System.out.println("----------------------Using Iterate---------------------------");
        Iterator<String>iterator=Cars.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
        }
    }
