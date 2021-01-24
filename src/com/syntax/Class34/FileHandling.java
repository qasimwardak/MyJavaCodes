package com.syntax.Class34;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class FileHandling {

    public static void main(String[] args) throws IOException {
        //Storing the path of the file in a String variable
        String path="C:\\Users\\Qasim\\eclipse-workspace\\QasimJava\\src\\com\\syntax\\Class34\\Credentials.properties";

        //creating a connection to file
        FileInputStream fileInputStream=new FileInputStream(path);

        //Loading the data from file to java program
        Properties properties=new Properties();
        properties.load(fileInputStream);

        //getting the values
        String username=(String) properties.get("username");
        String pass=(String) properties.get("password");
        int phone  = Integer.parseInt(properties.getProperty("phoneNumber"));
        System.out.println(phone);




        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\Qasim\\eclipse-workspace\\QasimJava\\Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver( );
        driver.get ( "https://www.facebook.com/" );
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(pass);

    }
}
