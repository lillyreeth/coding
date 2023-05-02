package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDeletedPage extends TestBase
{

    @FindBy(xpath="//b[contains(text(),'Account Deleted!')]")
    WebElement webElementConfirmText;
    @FindBy(xpath="//a[@class='btn btn-primary']")
    WebElement webElementContiuneButton;


    public AccountDeletedPage(){
        System.out.println("This is Account Deleted page constructor");
        PageFactory.initElements(driver, this);

    }


    public String validateAccountDeletedMessage()
    {

       String accountdeleteMsg= webElementConfirmText.getText();
        return accountdeleteMsg;
    }

    public WelcomePage clickAccountDeletedContinueButton()
    {
        webElementContiuneButton.click();
        return new WelcomePage();
    }






}
