package packageWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBoxEx {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[contains(text(),'Option 1')]"));
		
		WebElement e=driver.findElement(By.xpath("//label[contains(text(),'Option 3')]//input"));
		if(e.isSelected())
		{
			System.out.println("Already selected");
			
		}
		else
			e.click();
		Thread.sleep(1000);
		
		WebElement e2=driver.findElement(By.xpath("//form[@id='radio-buttons-selected-disabled']//input[2]"));
		
		if(e2.isEnabled())
		{
			e2.click();
		}
		else
			
			System.out.println("Checkbox is disabled");
		
		
		Thread.sleep(1000);
		driver.quit();
		
		
		
		
		

	}

}
