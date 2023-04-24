package com.qa.pages;

import com.qa.base.DriverClass_parent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Pages_Dropdowns extends DriverClass_parent
{

   static public void select_dropdowns(String Speed)
    {

        WebDriverWait wait=new WebDriverWait(driver, 20);
        //driver.findElement(By.xpath("//a[contains(text(),'Selectmenu')]")).click();

        WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(iframe);
//      WebElement dropdown_items=driver.findElement(By.xpath("//select[@id='speed']"));
        WebElement dropdown_items = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//select[@id='speed']"))));

        Select dropdowns=new Select(dropdown_items);
       // dropdowns.deselectAll();
        dropdowns.selectByValue(Speed);
        dropdowns.selectByVisibleText(Speed);
        dropdowns.selectByIndex(2);



    }

}
