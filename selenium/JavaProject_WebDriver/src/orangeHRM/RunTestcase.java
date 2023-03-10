package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RunTestcase {

	public static void main(String[] args) throws InterruptedException 
	{
	
	// Intiating object for chrome driver class and open Url
		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
	//step1: Login
	 
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        Thread.sleep(2000);
	
	//Step2: Do search in Admin
        
        driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("David.Morris");
		//Select dropdown=new Select(driver.findElement(By.xpath("//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]")));
		//dropdown.selectByVisibleText("ESS");
		//dropdown.selectByIndex(1);//here this dropdown is not implemented by developers using select tag in html.so,it didn't work here with select class.
		
		driver.findElement(By.xpath("//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
	    driver.findElement(By.xpath("//span[text()='ESS']")).click();
	    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	
	//step3: Logout
	   
	    driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	    //driver.findElement(By.linkText("Logout")).click();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	
	//step4: close the browser
		Thread.sleep(2000);
        driver.quit();
		
		
	}

}
