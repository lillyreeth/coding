package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsGetInTouchPage extends TestBase
{
    @FindBy(xpath="//div[@class='status alert alert-success']")
    WebElement SuccessMsg;
    @FindBy(xpath="//span[contains(text(),'Home')]")
    WebElement ReturnHome;


   public ContactUsGetInTouchPage()
   {
       System.out.println("This is ContactUs GetInTouch Page constructor");
       PageFactory.initElements(driver, this);

   }

   public String validateMsg()
   {
       return SuccessMsg.getText();
   }

   public WelcomePage click_Home()
   {
       ReturnHome.click();
       return new WelcomePage();
   }









}
