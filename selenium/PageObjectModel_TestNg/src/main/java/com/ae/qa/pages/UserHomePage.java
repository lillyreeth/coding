package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserHomePage extends TestBase
{


    @FindBy(xpath="//b[contains(text(),'mytesting0007')]")
    WebElement username_display;
    @FindBy(xpath="//a[contains(text(),'Delete Account')]")
    WebElement DeleteAccountLink;


    public UserHomePage() {
        System.out.println("This is user home page constructor");
        PageFactory.initElements(driver, this);

    }
    public String loggedInUser()
    {

        String username=username_display.getText();
        return username;
    }

    public AccountDeletedPage deleteAccountLink_click()
    {
        DeleteAccountLink.click();
        return new AccountDeletedPage();


    }








}
