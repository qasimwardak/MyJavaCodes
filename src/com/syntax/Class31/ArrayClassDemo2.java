package com.syntax.Class31;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayClassDemo2 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList=new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(150.00);
        doubleArrayList.add(152.00);
        doubleArrayList.add(189.00);
        doubleArrayList.add(185.00);
        doubleArrayList.add(15.00);
        System.out.println("Before removing");
        System.out.println(doubleArrayList);
       /* for (Double element:doubleArrayList RuntimeException because we are trying to perform two operation at the same time on a data structure
             ) {
            if(element<20){
                doubleArrayList.remove(element);
            }
        }*/

        //Unexpected results or runtime exception
       /* for (int i = 0; i < doubleArrayList.size(); i++) {
            if(doubleArrayList.get(i)<20.0){
                doubleArrayList.remove(doubleArrayList.get(i));
            }
        }
*/
        Iterator<Double> iterator = doubleArrayList.iterator();

        System.out.println("Before the while loop");
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }


        System.out.println("Before removing");
        System.out.println(doubleArrayList);

        //break 11:40

    }

    public static class Homework02 {
        /*
        Create a Card class that will have implemented  and unimplemented methods and a constructor
         that will initializes credit card type.  Create 3 subclasses of a Card card.
         Create 3 objects of different card and store them into LinkedList.
         Using for loop/advanced for loop/ iterator access all methods of the class.
         */
    }
}