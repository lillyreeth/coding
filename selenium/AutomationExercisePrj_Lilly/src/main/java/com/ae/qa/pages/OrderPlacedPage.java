package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrderPlacedPage extends TestBase
{
    @FindBy(xpath = "//a[contains(text(),'Delete Account')]")
    WebElement webElementDeleteAccountBtn;
    @FindBy(xpath = "//a[contains(text(),'Download Invoice')]")
    WebElement webElementDownloadInvoice;


     public OrderPlacedPage()
     {
         System.out.println("This is Checkout page constructor");
         PageFactory.initElements(driver, this);
     }

     public void clickDownloadInvoice()
     {
         webElementDownloadInvoice.click();
     }
    public void clickDeleteButton()
    {
        webElementDeleteAccountBtn.click();
    }

}
