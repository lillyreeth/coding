package packageWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownsEx {

	public static void main(String[] args) throws InterruptedException
	{
	
		
		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//button[contains(text(),'Allow essential and optional cookies')]")).click();

        //driver.findElement(By.xpath("//a[contains(text(),'Cookie Policy')]")).click();
        // contains didn't work for create a new account
        //driver.findElement(By.xpath("//a[contains(text(),'Create new account']")).click();
        
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        Select dropdownMonth= new Select(driver.findElement(By.id("month")));
        dropdownMonth.selectByIndex(4);
        Thread.sleep(2000);
        dropdownMonth.selectByValue("6");
        Thread.sleep(2000);
        dropdownMonth.selectByVisibleText("Dec");
        Thread.sleep(2000);
        List<WebElement> months=dropdownMonth.getOptions();
        
       // System.out.println(months.size());
        
       for(int i=0;i<months.size();i++)
        {
        	
        	System.out.println(months.get(i).getText());
        }
       
     
        driver.quit();
        
        
        
        
        

	}

}
