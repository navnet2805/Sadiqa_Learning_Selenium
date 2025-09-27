package TestNG_Example;

import org.testng.annotations.*;

public class TestNG_P01 {

    /*
    1. Login to application.
    2. Enter any item. -- exact test case
    3. Click on search button -- exact test case
    4. Logout.


    1. Login to application.
    2. click on Help and support --- exact test case
    4. Logout.
     */

    @BeforeSuite
    public void bs()
    {
        System.out.println("this is from before suite");
    }

    @BeforeTest
    public void beforetest()
    {
        System.out.println("this is from before test");
    }

    @BeforeClass
    public void RegressionStarted()
    {
        System.out.println("Regression testing is started");
    }

    @BeforeMethod
    public void LoginIntoApplication()
    {
        System.out.println("Login to application.");
    }

    @Test(priority = 100)
    public void VerifytheHelpandSupportTabIsWorkingFine()
    {
        System.out.println("Click on Help");
    }

    @Test(priority = 250)
    public void EnterAnyItemAndSearchIt()
    {
        System.out.println("Enter any item.");
        System.out.println("Click on search button");
    }

    @AfterMethod
    public void LogoutFromTheApplication()
    {
        System.out.println("Logout.");
    }

    @AfterClass
    public void RegressionExecutionCompleted()
    {
        System.out.println("Regression testing is ended");
    }

    @AfterTest
    public void Aftertest()
    {
        System.out.println("this is from After test");
    }

    @AfterSuite
    public void as()
    {
        System.out.println("from After suite");
    }
}
