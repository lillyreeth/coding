package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PIM_AddEmp 
{
   
	static public void AddEmployee(WebDriver driverObj,String FName,String MName,String LName,String EmpId,String UserName,String Status,String password) throws InterruptedException
	{
		
		
		driverObj.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(1000);
		driverObj.findElement(By.xpath("//a[contains(text(),'Add Employee')]")).click();
		Thread.sleep(1000);
		driverObj.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(FName);
		driverObj.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys(MName);
		driverObj.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(LName);
		
		driverObj.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='orangehrm-employee-container']/div[@class='orangehrm-employee-form']/div[@class='oxd-form-row']/div[2]/div[1]/div[1]/div[2]/input[1]")).sendKeys(EmpId);
		driverObj.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
		Thread.sleep(1000);
		driverObj.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='orangehrm-employee-container']/div[@class='orangehrm-employee-form']/div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys(UserName);
		
		Thread.sleep(1000);
		WebElement status_button1=driverObj.findElement(By.xpath("//label[text()='Enabled']"));
		WebElement status_button2=driverObj.findElement(By.xpath("//label[text()='Disabled']"));
		
		
		String s = Status.toLowerCase();
        if(s.compareTo("enabled") == 0)
		{
        	status_button1.click();
     	    Thread.sleep(1000);
		}
        else if(s.compareTo("disabled") == 0)
        {
         status_button2.click();
		 Thread.sleep(3000);
        }
        else
        {
        	status_button1.click();
             
        }
		
		driverObj.findElement(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys(password);
		
		driverObj.findElement(By.xpath("//div[@class='oxd-form-row user-password-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys(password);
	
				
		driverObj.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		Thread.sleep(2000);
			
		
		
	}

	
}
