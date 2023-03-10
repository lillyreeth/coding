package packageWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPopupEx {
	public static void main(String args[]) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='demo']")).click();

		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.quit();

	}

}
