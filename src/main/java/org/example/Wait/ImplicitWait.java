package org.example.Wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();//launch the browser
        driver.navigate().to("https://awesomeqa.com/practice.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
