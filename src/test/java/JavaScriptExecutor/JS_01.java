package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_01 {

    public static void main(String[] args) {

        //use explicit wait using visibilityofelementlocated

       WebDriver driver =new ChromeDriver();
       driver.get("https://www.idrive360.com/enterprise/");
       driver.manage().window().maximize();

       driver.findElement(By.xpath("//input[@id='username']")).click();
        System.out.println("username is clicked");

        //scrolling function using java script
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//a[contains(text(),\"Deploy via Group Policy\")]")));
                              //deployViaGroupPolicy.scrollIntoView(true);
        js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[contains(text(),\"Deploy via Group Policy\")]"))); //click on the ekement using java script.
    }
}
