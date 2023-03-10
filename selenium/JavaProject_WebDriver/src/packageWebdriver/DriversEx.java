
package packageWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriversEx {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Browser commands
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
//	     System.out.println("Title is: " + (driver.getTitle()));
//	     System.out.println("Current URL is: " + (driver.getCurrentUrl()));

		// String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");

		// driver.findElement(By.xpath("//a[@class='_8esh']"
		// )).sendKeys(selectLinkOpeninNewTab);
		// Thread.sleep(4000);

		// driver.close();
		// driver.quit();

		// Navigation commands

//	     driver.navigate().to("https://www.google.co.uk"); 
//	     Thread.sleep(5000);
//	     driver.navigate().back();"
//	     Thread.sleep(5000);
//	     driver.navigate().forward();

		// driver.navigate().refresh();

		//System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2")).getText());
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"u_0_2_9J\"]/div[3]/a")).isDisplayed());
		System.out.println(driver.findElement(By.linkText("Forgotten password?")).isEnabled());
		driver.quit();
		
		

	}

}
