package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin_Search 
{

	public void searchEmployee(WebDriver myChrome) throws InterruptedException
	{
		
		myChrome.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
		myChrome.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("David.Morris");
		myChrome.findElement(By.xpath("//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
	    myChrome.findElement(By.xpath("//span[text()='ESS']")).click();
	    myChrome.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	
		
	}
	
}
