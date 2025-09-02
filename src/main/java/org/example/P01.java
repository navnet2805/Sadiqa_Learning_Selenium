package org.example;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class P01 {
    //launch the browser

    public static void main(String[] args) {
        WebDriver obj = new ChromeDriver(); //creating object of chrome driver and assigning the address of obj to its parent(WebDirver) class
        obj.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //get() - it is 1 param method - return type is void.
        // it will create a GET request to the API .

        System.out.println("hello world");
        //obj.close();
        obj.quit();
    }
}
