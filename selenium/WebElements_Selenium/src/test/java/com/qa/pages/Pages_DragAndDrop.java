package com.qa.pages;

import com.qa.base.DriverClass_parent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Pages_DragAndDrop extends DriverClass_parent
{
    public void dragAndDrop()
    {
       WebElement iframe= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
       driver.switchTo().frame(iframe);
       WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
       WebElement destination=driver.findElement(By.xpath("//div[@id='droppable']"));
       Actions act=new Actions(driver);
       act.dragAndDrop(source,destination).build().perform();
    }
}
