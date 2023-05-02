package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.ae.qa.util.TestUtil.EXPLICIT_WAIT;

public class ContactUsGetInTouchPage extends TestBase
{
    @FindBy(xpath="//div[@class='status alert alert-success']")
    WebElement webElementGetInTouchSuccessMessage;
    @FindBy(xpath="//span[contains(text(),'Home')]")
    WebElement webElementGetInTouchHomeButton;


   public ContactUsGetInTouchPage(){
       System.out.println("This is ContactUs GetInTouch Page constructor");
       PageFactory.initElements(driver, this);

   }

   public String getGetInTouchSuccessMessage()
   {
       EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementGetInTouchSuccessMessage));
       return webElementGetInTouchSuccessMessage.getText();
   }

   public WelcomePage clickGetInTouchHomeButton()
   {
       EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementGetInTouchHomeButton));
       webElementGetInTouchHomeButton.click();
       return new WelcomePage();
   }









}
