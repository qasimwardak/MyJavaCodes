package com.syntax.Class20;

public class Task4 {

        String name;
        String address;

        Task4(String name, String address) {
            this.name = name;
            this.address = address;
        }

        void displayInfo() {
            System.out.print("name " + name);
            System.out.println(" Address" + address);
        }

        public static void main(String[] args) {
            Task4 studentA = new Task4("john", "123 Fairfax");
            studentA.displayInfo();
            Task4 studentB = new Task4("karim", "123 Algiers");
            studentB.displayInfo();
        }
    }

