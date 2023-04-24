package com.qa.pages;

import com.qa.base.DriverClass_parent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Pages_Scroll extends DriverClass_parent
{
   static public void scroll()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //sroll By using pixels
        //js.executeScript("window.scrollBy(0,1000)");
        //Scroll until an element is found(By using visibility of element)
        WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Report a Bug')]"));
        js.executeScript("arguments[0].scrollIntoView();",element);

    }
}
