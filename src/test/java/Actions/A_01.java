package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class A_01 {

    A_01 a ;

    @Test
    public void Test01(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("sex-1")).click();
        driver.findElement(By.id("exp-1")).click();
        WebElement cbxProfession = driver.findElement(By.id("profession-1"));
        Actions actions = new Actions(driver);
       // actions.moveToElement(prof).sendKeys(Keys.ENTER).perform(); //this will click on Enter button
       // actions.moveToElement(prof).click().perform(); //mouse actions
//        actions.clickAndHold().moveToElement();
        driver.findElement(By.id("tool-1")).click();
        driver.findElement(By.id("submit")).click();
        driver.quit();
        /*
        fetch element ---
        move the cursor to that element --actions.Movetooo.
        give some value --- actions.sendkeys("java")
        using keyboard eneter it. --- actions.sendkeys(keys.ENTER)
        move the cursor to the next element --- --actions.Movetooo......
         */



    }


}
