package TestNG_Example;

import org.testng.annotations.Test;

public class TestNG_P03 {

    public void m09()
    {

    }

    @Test
    public void m01()
    {
        System.out.println("from P02 class.m01");
        m09();
    }

    @Test(enabled = false) // this test case will not executed
    public void m02()
    {
        System.out.println("from P02 class.m02");
    }

    @Test(dependsOnMethods = "m04") //m03 will be executed only when m04 method executes
    public void m03()
    {
        System.out.println("from P02 class.m03");
    }

    @Test(priority = 2) //when the test case is set for priority it will compare with other priority tc and sort/execute in ascending order
    public void m04()
    {
        System.out.println("from P02 class.m04");
    }


    @Test(priority = 1)
    public void m05()
    {
        System.out.println("from P02 class.m04");
    }
}
