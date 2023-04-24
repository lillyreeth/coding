import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersEx
{
    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser,String app)
    {
        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.get(app);
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
