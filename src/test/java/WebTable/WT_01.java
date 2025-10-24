package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WT_01 {

    @Test
    public void Test01()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://awesomeqa.com/webtable.html");

        //Fetch the country name for the company microsoft

        //1. find the table
        driver.findElement(By.xpath("//table[@id='customers']"));

        //2. to find the number of rows
        int noOfRows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        System.out.println(noOfRows);

        //3. Fetch the number of column.
        int noOfColumns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
        System.out.println(noOfColumns);

        for (int i=2 ; i<=noOfRows ; i++)
        {
            /*
            xpath = //table[@id='customers']/tbody/tr[5]/td[1]
            1st part: //table[@id='customers']/tbody/tr[
            2nd part: i --- to get specific company name
            3rd part: ]/td[1]
             */
            WebElement element = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[1]")); // td=1, 1st column company name
            if (element.getText().equals("Microsoft"))
            {
                WebElement countryname = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[3]")); //updated td=3 , 3rd column is country name
                System.out.println("The country name for the company "+element.getText()+" is " +countryname.getText());
                break;
            }
        }

        driver.quit();

    }
}
