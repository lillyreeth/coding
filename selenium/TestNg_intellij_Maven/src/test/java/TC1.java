import org.testng.annotations.*;

public class TC1
{
     @BeforeMethod
    void beforeMethod()
    {
        System.out.println("TC1 Before Method");
    }
    @AfterMethod
    void AfterMethod()
    {
        System.out.println("TC1 After Method");
    }

    @BeforeClass
    void beforeClass()
    {
        System.out.println("TC1 Before Class");
    }
    @AfterClass
    void AfterClass()
    {
        System.out.println("TC1 After Class");
    }
    @BeforeTest
    void BeforeTest()
    {
        System.out.println(" Before Test");
    }
    @AfterTest
    void AfterTest()
    {
        System.out.println("After Test");
    }
    @BeforeSuite
    void BeforeSuite()
    {
        System.out.println("Before suite");
    }
    @AfterSuite
    void AfterSuite()
    {
        System.out.println("After suite");
    }
    @Test
    void test1()
    {
        System.out.println("This is from TC1");
    }


}
