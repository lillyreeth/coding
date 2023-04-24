import org.testng.annotations.DataProvider;

public class CustomDataProvider
{

    @DataProvider(name="LoginData_diffClass")
    public Object[][] getData() {
        Object[][] data = {{"Karthik", "abc"}, {"Reethu.com", "xyz"}, {"Lilly", "pqr"}};
        return data;
    }
}
