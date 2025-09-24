package org.example.Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();//launch the browser
        driver.navigate().to("https://awesomeqa.com/practice.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
       WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));


    }

}
