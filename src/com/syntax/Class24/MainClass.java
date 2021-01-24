package com.syntax.Class24;



    class GrandParent {
        void calculate(int a, int b) {
            System.out.println("Class X");
        }
    }

    class Parent extends GrandParent {
        @Override
        void calculate(int a, int b) {
            System.out.println("Class Y");
        }
    }

    class PoorChild extends Parent {
        @Override
        void calculate(int a, int b) {
            System.out.println("Class Z");
        }

        void printSpecial() {
            System.out.println("This is my own method");
        }
    }

    public class MainClass {
        public static void main(String[] args) {
            //creating an object of type y and as X is a parent of Y we can
            //store the y into a box of type X
            GrandParent grandParent = new Parent();

            grandParent.calculate(10, 20);

            Parent parent = (Parent) grandParent;

            parent.calculate(50, 100);

            PoorChild poorChild = (PoorChild) parent;

            poorChild.calculate(100, 200);


            //Break till 1:05
        }
    }

