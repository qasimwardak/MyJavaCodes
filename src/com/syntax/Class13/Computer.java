package com.syntax.Class13;

public class Computer {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.make = "Mac";
        laptop.model = "pro 16";
        laptop.storage = 1;
        laptop.RAMCapacity = 16;
        laptop.color = "pink";
        laptop.processor = "Core i7";
        laptop.GPU = "Nvidia RTX 3090 12GB DDR6x";
        laptop.playMovie();
        laptop.browseInternet();
        laptop.makeVideoCall(" Qasim");
        laptop.getmModel();
        System.out.println(laptop.model);
    }
}
