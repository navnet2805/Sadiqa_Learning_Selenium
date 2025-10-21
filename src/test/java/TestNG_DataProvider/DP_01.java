package TestNG_DataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP_01 {

    @DataProvider(name = "logindata")
    public Object[][] LoginData_Get() //we just created a method which will return number of user/pwd combinations
    {
        return new Object[][]{
                {"user1","password1"},
                {"user2","pwd2"},
                {"user3", "pwd3"}
        };
    }

    @Test(dataProvider = "logindata")
    public void Login(String username,String pwd)
    {
        System.out.println(username + "--" +pwd);
        if (username.equals("username"))
            Assert.fail();
    }

    @Test(invocationCount = 2) // executed 2 times
    public void Validation()
    {
        System.out.println("a=b");
    }

    @Test
    public void Logout()
    {
        System.out.println("Logout");
    }
}
