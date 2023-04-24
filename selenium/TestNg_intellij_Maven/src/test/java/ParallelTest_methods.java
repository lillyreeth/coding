import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ParallelTest_methods
{
    WebDriver driver;
    @BeforeClass
    void setup()
    {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        //driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    void logoTest() throws InterruptedException
    {
        Thread.sleep(5000);
        WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
        Assert.assertTrue(logo.isDisplayed());
    }
    @Test
    void titleTest() throws InterruptedException
    {
        Thread.sleep(5000);
        String title=driver.getTitle();
        //Display messgae if the condition fails
        Assert.assertEquals("Title not matched","OrangeHRM",title);

    }

    @AfterClass
    void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }


}
