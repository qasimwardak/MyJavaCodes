package com.syntax.Class13;

public class Laptop {
    String make;
    String model;
    int storage;
    int RAMCapacity;
    String color;
    String processor;
    String GPU;

    void playMovie() {
        System.out.println("Playing movies");
    }
    void browseInternet() {
        System.out.println("browsing the Internet");
    }
    void makeVideoCall(String contact) {
        System.out.println("Video calling to"+contact);
    }
    public String getmModel() {
        return model;
    }

}
