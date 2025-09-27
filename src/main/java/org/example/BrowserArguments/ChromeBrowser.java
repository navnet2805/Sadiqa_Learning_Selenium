package org.example.BrowserArguments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--window-size=1920,1080");
        chromeOptions.addArguments("--headless");

        WebDriver obj = new ChromeDriver(chromeOptions);
        obj.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        System.out.println("Program has terminated");

        Thread.sleep(3000);
        obj.quit();
    }
}
