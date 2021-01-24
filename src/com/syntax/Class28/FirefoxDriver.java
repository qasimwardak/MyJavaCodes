package com.syntax.Class28;

public class FirefoxDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Open Fox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Fox Browser");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Fox Browser Window");

    }

    @Override
    public void findElement() {
        System.out.println("Find Element in Fox Browser");

    }
}
