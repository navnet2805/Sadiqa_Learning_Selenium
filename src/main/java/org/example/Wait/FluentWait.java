package org.example.Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FluentWait {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();//launch the browser
        driver.navigate().to("https://awesomeqa.com/practice.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30)) // max time limit
                .pollingEvery(Duration.ofSeconds(5)); //frequency of time to check the condition

       WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));


    }
}
