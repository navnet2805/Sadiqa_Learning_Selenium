import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot_program {

    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
       TakesScreenshot ts =(TakesScreenshot) driver; //explicit casting
        File src = ts.getScreenshotAs(OutputType.FILE); // this method will capture screenshot
        File Target = new File("./screenshots/"+"image.png");
        FileHandler.copy(src,Target);

        driver.quit();

    }
}
