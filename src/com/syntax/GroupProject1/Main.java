package com.syntax.GroupProject1;

public class Main {

        public static void main(String[] args) {
            Shape shape=new Square();
            double a=shape.area(10);
            System.out.println(a+" area");
            double b=shape.perimeter(10);
            System.out.println(b+" perimeter");

            Shape shape1=new Circle();
            double c=shape.perimeter(5);
            System.out.println(c+" permeter");
            System.out.println(shape.area(14)+" area");
        }
    }

