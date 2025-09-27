package org.example.BrowserArguments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeBrowser {
    public static void main(String[] args) throws InterruptedException {

        EdgeOptions edgeOptions =new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--window-size=1920,1080");
        edgeOptions.addArguments("--headless");

        WebDriver obj = new EdgeDriver(edgeOptions);
        obj.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        System.out.println("Program has terminated");

        Thread.sleep(3000);
        obj.quit();
    }
}
