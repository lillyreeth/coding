import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsEx
{
    WebDriver driver;
    @BeforeClass
    void setup()
    {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority=1)
    void logoTest() throws InterruptedException
    {
        Thread.sleep(2000);
        WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
        Assert.assertTrue(logo.isDisplayed());
    }
    @Test(priority=2)
    void titleTest() throws InterruptedException
    {
        Thread.sleep(2000);
         String title=driver.getTitle();
         //Display messgae if the condition fails
        Assert.assertEquals("Title not matched","OrangeHRM",title);

    }

    @AfterClass
    void teardown()
    {
        driver.quit();
    }


}
