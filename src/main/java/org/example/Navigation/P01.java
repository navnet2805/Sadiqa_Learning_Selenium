package org.example.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();//launch the browser
        driver.navigate().to("https://awesomeqa.com/practice.html");
//        driver.navigate().forward();
//        driver.navigate().back();
//        driver.navigate().refresh();
        System.out.println(driver.getPageSource()); // html code
    }
}
