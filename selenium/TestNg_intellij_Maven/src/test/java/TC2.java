import org.testng.annotations.*;

public class TC2
{

    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("TC2 Before Method");
    }
    @AfterMethod
    void AfterMethod()
    {
        System.out.println("TC2 After Method");
    }

    @BeforeClass
    void beforeClass()
    {
        System.out.println("TC2 Before class");
    }
    @AfterClass
    void AfterClass()
    {
        System.out.println("TC2 After class");
    }
    @Test
    void Test2()
    {
        System.out.println("This is from TC2");
    }









}
