package packageWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragDropEX {

	public static void main(String[] args) throws InterruptedException {
		

		
		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement e1=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement e2=driver.findElement(By.xpath("//div[@id='box106']"));
		
		
		Actions act=new Actions(driver);
		//act.clickAndHold(e1).moveToElement(e2).release().build().perform(); (OR)
		act.dragAndDrop(e1, e2).build().perform();
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
