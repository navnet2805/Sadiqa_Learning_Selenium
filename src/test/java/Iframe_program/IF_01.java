package Iframe_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IF_01 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice-automation.com/iframes/");

        driver.switchTo().frame("iframe-1");
        driver.findElement(By.xpath("//span[@class='DocSearch-Button-Placeholder' and contains(text(),\"Search\")]")).click();

        driver.switchTo().defaultContent(); //switch to main page from iframe;

        //switching iframe to another iframe is not possible

        driver.quit();
    }
}
