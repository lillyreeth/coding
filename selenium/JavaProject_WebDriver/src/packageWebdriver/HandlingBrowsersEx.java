package packageWebdriver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingBrowsersEx {

	public static void main(String[] args) throws Exception {

		System.setProperty("Webdriver.chrome.driver", "/JavaProject_WebDriver/External_Files");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/att_a_target.asp");
		driver.findElement(By.id("accept-choices")).click();

		String NewsLetter = "//div[@class='w3-col m12 w3-hide-medium w3-hide-small']//a[@class='w3-btn ws-black w3-block w3-round'][contains(text(),'Newsletter')]";

		String forum = "//a[contains(text(),'FORUM')]";
		String certified = "//a[@id='cert_navbtn']";
		driver.findElement(By.xpath(NewsLetter)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(forum)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(certified)).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		HashSet<String> windows = (HashSet<String>) driver.getWindowHandles();
		System.out.println("Value of Hashset windows names : " + windows);

		// Creating an ArrayList object(string type)

		List<String> names = new ArrayList<String>();

		// To read values from windows Hashset into names ArrayList,we took an iterator
		Iterator itr = windows.iterator();
		while (itr.hasNext()) {

			names.add(itr.next().toString());
		}
		System.out.println("Value of array list names: " + names);

		// Read each item from the arraylist and switch to that tab

		for (int i = 0; i < names.size(); i++)

		{
			driver.switchTo().window(names.get(i));
			System.out.println(driver.getTitle());

		}

		// System.out.println(driver.getTitle());
		driver.quit();

	}

}
