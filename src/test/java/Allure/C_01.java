package Allure;

import io.qameta.allure.*;
import org.testng.annotations.Test;

@Epic("Help and Support")
@Feature("Verify Help functionality")
public class C_01 {


    @Test(description = "Verify the help and Support tab")
    @Story("Validating Help and Support story")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name = "POM-2045", url = "https://jira.com/POM-2045")
    public void VerifytheHelpandSupportTabIsWorkingFine()
    {
        System.out.println("Click on Help");
    }


    @Test
    public void VerifytheHelpandSupportTabIsNotWorkingFine()
    {
        System.out.println("Click on Help and support");
    }


    @Test
    public void VerifytheHelpandSupportTabIsWorkingFine1()
    {
        System.out.println("Workign fine 1");
    }
}
