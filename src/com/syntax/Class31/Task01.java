package com.syntax.Class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task01 {
    public static void main(String[] args) {
    /*
    Create an arrayList of even numbers from 1 to 50. Remove any number that is divisible
     by 5 from that arrayList.
     */

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i <=50 ; i+=2) {
            evenNumbers.add(i);
        }
        System.out.print(evenNumbers+ " ");
        Iterator<Integer> iterator= evenNumbers.iterator();
        while(iterator.hasNext()){
            if(iterator.next() %5==0)
                iterator.remove();
        }
        System.out.println();
        System.out.print(evenNumbers);
    }

            }


