package parallelTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelTest_class1
{
    WebDriver driver;
    @BeforeClass
    void setup_class1()
    {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        //driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    void logoTest_class1() throws InterruptedException
    {
        Thread.sleep(5000);
        WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
        Assert.assertTrue(logo.isDisplayed());
    }
    @Test
    void titleTest_class1() throws InterruptedException
    {
        Thread.sleep(5000);
        String title=driver.getTitle();
        //Display messgae if the condition fails
        Assert.assertEquals("Title not matched","OrangeHRM",title);

    }

    @AfterClass
    void teardown_class1() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }


}
