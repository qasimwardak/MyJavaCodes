package com.syntax.Class28;


public class Main{
    public static void main(String[] args) {
        WebDriver webDriver=new ChromeDriver();
        webDriver.openBrowser();
        webDriver.closeBrowser();
        webDriver.maximizeWindow();
        webDriver.findElement();
        WebDriver webDriver1=new FirefoxDriver();
        webDriver1.openBrowser();
        webDriver1.closeBrowser();
        webDriver1.maximizeWindow();
        webDriver1.findElement();
    }
}
