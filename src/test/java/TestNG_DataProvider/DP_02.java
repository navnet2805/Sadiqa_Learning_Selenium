package TestNG_DataProvider;

import org.testng.annotations.Test;

public class DP_02 {

    @Test(dataProvider = "logindata" , dataProviderClass = DP_01.class) //if you are using DataProvider in a different class. dataProviderClass = DP_01.class
    public void Login(String username,String pwd)
    {
        System.out.println(username + "--" +pwd);
    }
}
