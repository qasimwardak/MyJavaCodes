package com.syntax.GroupProject5;



public class SafariDriver implements RemoteWebDriver {


    @Override
    public void navigate() {
        System.out.println("Navigates safari web browser page");

    }

    @Override
    public void getScreenshot() {
        System.out.println("Takes screenshot of the safari web browser page");

    }

    @Override
    public void open() {
        System.out.println("Opens safari  web browser");

    }

    @Override
    public void close() {
        System.out.println("Closes safari web browser");

    }

    @Override
    public void getTitle() {
        System.out.println("Takes safari web browser title");

    }
}





