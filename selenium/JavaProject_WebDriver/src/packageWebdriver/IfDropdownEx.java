package packageWebdriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
import org.openqa.selenium.support.ui.Select;

public class IfDropdownEx {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//button[contains(text(),'Allow essential and optional cookies')]")).click();
		driver.findElement(By.linkText("Create new account")).click();
	    Thread.sleep(2000);
	    Select dropdownMonth= new Select(driver.findElement(By.id("month")));
	    List <WebElement> opt =dropdownMonth.getOptions();
	    LinkedList list1=new LinkedList();
	    
	    
	    for (int i=0;i<opt.size();i++)
	    {
	     list1.add(opt.get(i).getText());
	    }
	    System.out.println("The Original list values are: " + list1);
	    
	    LinkedList list2=new LinkedList(list1);
	    
//	    list2 =(LinkedList) list1.clone();
//	    
        System.out.println("The temp list values are: " + list2);
        Collections.sort(list2);
        System.out.println("sorted list : " + list2);
        
        
        boolean sort=list2.equals(list1);
        if (sort)
        {
        	System.out.println("Both are same");
        	
        }
        else
        	System.out.println("Both are different");
        
        
        
	    Thread.sleep(1000);
	    
	    driver.quit();
	    
	    
	    
	    
	    
	    
	}

}
