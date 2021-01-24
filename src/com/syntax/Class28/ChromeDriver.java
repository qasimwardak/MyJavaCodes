package com.syntax.Class28;

public class ChromeDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Open Chrome Browser");

    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome Browser");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Chrome Browser Window");

    }

    @Override
    public void findElement() {
        System.out.println("Find Element in Chrome Browser");

    }
}
