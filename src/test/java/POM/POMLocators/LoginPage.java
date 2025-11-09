package POM.POMLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    //Basic POM
   private By username_loc = By.name("username");
   private By password_loc = By.name("password");
   private By signin_btn = By.xpath("//button//span[text()='Sign in']");


    //Page factory
   private @FindBy(name = "username") WebElement username_loc_pf;
   private @FindBy(name = "password") WebElement password_loc_pf;
   private @FindBy(xpath = "//button//span[text()='Sign in']" ) WebElement signin_btn_pf;

    //Page Factory Action method
    public void setUsername_loc_pf(String username1)
    {
        username_loc_pf.sendKeys(username1);
    }

    public void setPassword_loc_pf(String password1)
    {
        password_loc_pf.sendKeys(password1);
    }

    public void setSignin_btn_pf()
    {
        signin_btn_pf.click();
    }

    public void login_pf(String UN, String PW)
    {
        setUsername_loc_pf(UN);
        setPassword_loc_pf(PW);
        setSignin_btn_pf();
    }

    public void login_pf(String UN, String PW, boolean selectCheckbox)
    {
        setUsername_loc_pf(UN);
        setPassword_loc_pf(PW);
        //setremebermecheckbox()
        setSignin_btn_pf();
    }


    //Basic action method
    public void setUsername_loc(String username1)
    {
        WebElement username = driver.findElement(username_loc);
        username.sendKeys(username1);
    }

    public void setPassword_loc(String password1)
    {
        WebElement password = driver.findElement(password_loc);
        password.sendKeys(password1);
    }

    public void setSignin_btn()
    {
        WebElement signin = driver.findElement(signin_btn);
        signin.click();
    }

    public void login(String UN, String PW)
    {
        setUsername_loc(UN);
        setPassword_loc(PW);
        setSignin_btn();
    }

    public void login(String UN, String PW, boolean selectCheckbox)
    {
        setUsername_loc(UN);
        setPassword_loc(PW);
        //setremebermecheckbox()
        setSignin_btn();
    }





}
