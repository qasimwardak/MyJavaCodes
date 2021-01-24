package com.syntax.Class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Homework03 {
    /*
    Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
     */
    public static void main(String[] args) {
        HashMap<Integer, String > bestBuy=new HashMap<>();
        bestBuy.put(11111, "TV");
        bestBuy.put(22222, "Radio");
        bestBuy.put(33333, "Microwave");
        bestBuy.put(44444, "Refridgerator");
        bestBuy.put(55555, "Washer");
        bestBuy.put(66666, "Dryer");
        bestBuy.put(77777, "DishvWasher");
        //Set<Map.Entry<Integer, String>> entries= bestBuy.entrySet();
       // System.out.println(entries);
        Iterator<Map.Entry<Integer, String>> iterator=bestBuy.entrySet().iterator();
        for (Map.Entry<Integer, String> entry:bestBuy.entrySet()) {
            System.out.println(entry);
        }
            System.out.println("----------------------Using Iterator__________________________");
            while (iterator.hasNext()) {
                Map.Entry<Integer, String> next = iterator.next();
                System.out.println("{"+next+"}");
                //System.out.println(next);

            }
        }
    }

