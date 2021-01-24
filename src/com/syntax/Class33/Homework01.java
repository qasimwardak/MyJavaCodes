package com.syntax.Class33;

import com.syntax.class01.SyntaxProgramming;

import java.util.HashMap;

public class Homework01 {
    public static void main(String[] args) {
        /*
        Create a map of a building. Store floor number and it is associated company name.
        (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
         */
        HashMap<Integer, String> Building = new HashMap();
        Building.put(1, "Fabook");
        Building.put(2, "Google");
        Building.put(3, "Microsoft");
        Building.put(4, "Syntax");
        Building.put(5, "Amazon");
        Building.put(6, "Apple");
        Building.put(7, "Syntax");
        System.out.println(Building.size());
        Building.replace(4,"Tik Tok");
        System.out.println(Building);
        Building.remove(7);
        System.out.println(Building);



    }
}