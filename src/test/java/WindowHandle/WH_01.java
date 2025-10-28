package WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WH_01 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");

        String parent_tab = driver.getWindowHandle(); //current window address
        System.out.println(parent_tab);

        driver.findElement(By.linkText("Click Here")).click(); //select the link

        Set<String> mutliple_windows = driver.getWindowHandles();
        System.out.println(mutliple_windows);

        for (String handle : mutliple_windows)
        {
            if (!handle.equals(parent_tab))
            {
                driver.switchTo().window(handle); // switch to different window
                if (driver.getPageSource().contains("New Window"))
                {
                    System.out.println("Test is passed");
                }
                break;
            }
        }

        driver.quit();
    }

}
