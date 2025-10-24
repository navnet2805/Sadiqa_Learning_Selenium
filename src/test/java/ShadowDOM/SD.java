package ShadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SD {

    @Test
    public void Test1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://dev.automationtesting.in/shadow-dom");

        //find the sahdow DOM element
        SearchContext shadow_element = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot(); // will give access to shadow element via shadow root.
        shadow_element.findElement(By.cssSelector("#shadow-element"));

        driver.quit();
    }

    @Test
    public void Test2()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://dev.automationtesting.in/shadow-dom");

        //find the sahdow DOM element
        SearchContext shadow_element10 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();// will give access to 1st shadow element via shadow root.
        SearchContext shadow_element20=shadow_element10.findElement(By.cssSelector("#shadow-root")).getShadowRoot();  // will give access to 2nd shadow element via 1st shadow root.
        //to find the nested shadow root element
        shadow_element20.findElement(By.cssSelector("#nested-shadow-element"));

        driver.quit();
    }

}
