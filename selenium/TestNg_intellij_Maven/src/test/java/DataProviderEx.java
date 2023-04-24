import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx
{

    @Test(dataProvider = "LoginDataSameClass")
    public void loginTest(String email,String pasword)
    {

        System.out.println(email +"   " + pasword);
    }

    @DataProvider(name="LoginDataSameClass")
    public Object[][] getData()
    {
        Object[][] data={{"abc@gmail.com","abc"},{"xyz@gmail.com","xyz"},{"pqr@gmail.com","pqr"}};
        return data;
    }

    @Test(dataProvider = "LoginData_diffClass", dataProviderClass = CustomDataProvider.class)
    public void loginTest_using_custom_provider(String name,String pasword)
    {

        System.out.println(name +"   " + pasword);
    }

}
