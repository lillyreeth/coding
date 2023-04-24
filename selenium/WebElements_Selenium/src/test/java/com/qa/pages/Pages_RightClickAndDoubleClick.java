package com.qa.pages;

import com.qa.base.DriverClass_parent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Pages_RightClickAndDoubleClick extends DriverClass_parent
{

    static public void rightClick() throws InterruptedException {

        WebElement iframe=driver.findElement(By.id("gdpr-consent-notice"));
        driver.switchTo().frame(iframe);
        WebElement cookie_button=driver.findElement(By.id("save"));
        cookie_button.click();
        driver.switchTo().defaultContent();
        WebElement link1=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
        Actions act=new Actions(driver);
        act.contextClick(link1).build().perform();
        Thread.sleep(2000);
        WebElement click_copy=driver.findElement(By.xpath("//span[contains(text(),'Copy')]"));
        act.moveToElement(click_copy).click().build().perform();
       // Thread.sleep(2000);
        driver.switchTo().alert().accept();

    }

     static public void doubleClick() throws InterruptedException {
        WebElement link2=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
        Actions act=new Actions(driver);
        act.doubleClick(link2).build().perform();
      //  Thread.sleep(2000);
         System.out.println("before alert button");

        driver.switchTo().alert().accept();
         System.out.println("after alert button");
    }
}
