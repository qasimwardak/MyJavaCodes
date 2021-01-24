package com.syntax.GroupProject5;



public class FirefoxDriver implements RemoteWebDriver{


    @Override
    public void navigate() {
        System.out.println("Navigates firefox web browser page");

    }

    @Override
    public void getScreenshot() {
        System.out.println("Takes screenshot of the firefox web browser page");

    }

    @Override
    public void open() {
        System.out.println("Opens firefox  web browser");

    }

    @Override
    public void close() {
        System.out.println("Closes firefox web browser");

    }

    @Override
    public void getTitle() {
        System.out.println("Takes firefox web browser title");

    }
}



