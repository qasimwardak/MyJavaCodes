package com.syntax.Class28;

public interface WebDriverTester {
        static void main(String[] args) {
        WebDriver webDriver=new FirefoxDriver();
        webDriver.openBrowser();
        webDriver.closeBrowser();
        webDriver.maximizeWindow();
        webDriver.findElement();
        WebDriver webDriver1=new ChromeDriver();
        webDriver1.openBrowser();
        webDriver1.closeBrowser();
        webDriver1.maximizeWindow();
        webDriver1.findElement();

    }
    }