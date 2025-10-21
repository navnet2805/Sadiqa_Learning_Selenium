package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class alert01 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); //implicitly wait

        driver.findElement(By.xpath("//button[text()='Alert']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent()); //alertIsPresent()-- wait until alert is popped up.

        //Alert is interface
        Alert alert = driver.switchTo().alert(); //control of driver from HTML page to alert popup.
        alert.accept(); //click on ok button from the alert pop up.
    }
}
