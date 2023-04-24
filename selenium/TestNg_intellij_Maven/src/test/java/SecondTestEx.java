import org.testng.annotations.Test;

public class SecondTestEx
{

    @Test(priority = 1)
    public void login_SecondTestCase()
    {

        System.out.println("Login Method");

    }
    @Test(priority = 2)
    public void searchEmp_SecondTestCase()
    {

        System.out.println("SearchEmp Method");

    }
    @Test(priority = 3)
    public void logout_SecondTestCase()
    {

        System.out.println("Logout Method");

    }

}
