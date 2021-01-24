package com.syntax.GroupProject1;

public class Square implements Shape{
    @Override
    public double area(double lenght) {
        return(lenght*lenght);
    }
    @Override
    public double perimeter(double lenght) {
        return (lenght*4);
    }
}

