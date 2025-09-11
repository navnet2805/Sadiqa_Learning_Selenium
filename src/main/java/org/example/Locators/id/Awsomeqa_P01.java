package org.example.Locators.id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Awsomeqa_P01 {
    public static void main(String[] args) {
         WebDriver driver=new ChromeDriver();//launch the browser
        driver.get("https://awesomeqa.com/practice.html");


        //driver.findElement(By.xpath("//input[@id=\"sex-0\"]")).click();

        By gender_male = By.xpath("//input[@id=\"sex-0\"]");
                By.linkText("Click here to Download File");
                By.partialLinkText("Click");
        WebElement gender_male_checkbox = driver.findElement(gender_male);
        gender_male_checkbox.click();
    }
}
