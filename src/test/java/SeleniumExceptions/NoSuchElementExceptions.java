package SeleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

public class NoSuchElementExceptions {
    @Test
    public void NoSuchElementException_Test()
    {
        WebDriver driver = null; // some other sessions might not be terminated. best case to assign null to driver.
        try {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.flipkart.com/");

            WebElement searchbox = driver.findElement(By.id("Naveen"));
            searchbox.sendKeys("macmini");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            driver.quit();
        }
    }
}
