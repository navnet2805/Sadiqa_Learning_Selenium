package POM.TestCases;

import POM.BaseTest;
import POM.POMLocators.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.HdrDocumentImpl;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
    WebDriver driver;

    @BeforeMethod
    public void setup()
    {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void  teardown()
    {
        driver.quit();
    }

    @Test
    public void testCaseName()
    {
        driver.get("https://app.vwo.com/#/login"); //launch URL
       LoginPage lp= new LoginPage(driver);
       lp.login("Naveen","Password"); //login into application
    }
}
