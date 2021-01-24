package com.syntax.Class16;

public class Task06 {
     static void sayHello (String countryName) {
     switch (countryName) {

         case "USA":
             System.out.println("Hello");
             break;
         case "Spanish":
             System.out.println("Hola");
             break;
         case "Afghanistan":
             System.out.println("Salam");
             break;
         default:
             System.out.println("country not supported");
     }
    }
}
