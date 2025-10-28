package SeleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class StaleElementException {

    @Test
    public void StaleElementReferenceException_Test()
    {
        WebDriver driver = null;
        try {
            driver = new ChromeDriver();
            driver.get("https://www.flipkart.com/");

            WebElement searchbox = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")); //found the element
           driver.navigate().refresh(); //reload of page
            searchbox.sendKeys("macmini"); //using the element found in line number 21
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            driver.quit();
        }

    }
}
