package com.syntax.GroupProject5;



public class ChromeDriver implements RemoteWebDriver {


    @Override
    public void navigate() {
        System.out.println("Navigates chorme web browser page");

    }

    @Override
    public void getScreenshot() {
        System.out.println("Takes screenshot of the chrome web browser page");

    }

    @Override
    public void open() {
        System.out.println("Opens chrome  web browser");

    }

    @Override
    public void close() {
        System.out.println("Closes chorme web browser");

    }

    @Override
    public void getTitle() {
        System.out.println("Takes chrome web browser title");

    }
}

