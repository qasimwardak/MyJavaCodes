package com.syntax.GroupProject1;


public class Circle implements Shape{
    double pie=3.14;
    @Override
    public double area(double lenght) {
        return (pie*(lenght*lenght));
    }
    @Override
    public double perimeter(double lenght) {
        return (2*pie*lenght);
    }
}