package com.syntax.Class37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Task1 {

        public static void main(String[] args) throws IOException {
            String path="C:\\Users\\Qasim\\eclipse-workspace\\QasimJava\\src\\com\\syntax\\Class37\\configurations.properties";
            FileInputStream fileInputStream=new FileInputStream(path);

            Properties properties=new Properties();
            properties.load(fileInputStream);
            String browser=(String)properties.get("browser");
            String url=(String)properties.get("url");
            String username=(String)properties.get("username");
            String password=(String)properties.get("password");

            if(browser.contains("Chrome")) {
                System.setProperty("webdriver.chrome.driver","C:\\Users\\Qasim\\eclipse-workspace\\QasimJava\\Drivers\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get(url);
                driver.findElement(By.id("email")).sendKeys(username);
                driver.findElement(By.id("pass")).sendKeys(password);
            }else if(browser.contains("firefox")){
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\Qasim\\eclipse-workspace\\QasimJava\\Drivers\\geckodriver.exe");
                WebDriver driver = new FirefoxDriver();
                driver.get(url);
                driver.findElement(By.id("email")).sendKeys(username);
                driver.findElement(By.id("pass")).sendKeys(password);
            }else{
                System.out.println("Invalid browser");
            }
        }
    }


