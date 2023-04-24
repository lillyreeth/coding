import org.testng.annotations.Test;

public class GroupingEx
{
    @Test(groups={"sanity"})
    public void login()
    {

        System.out.println("Login Method");

    }
    @Test(groups={"sanity"})
    public void searchEmp()
    {

        System.out.println("SearchEmp Method");

    }
    @Test(groups={"regression"})
    public void logout()
    {

        System.out.println("Logout Method");

    }

}
