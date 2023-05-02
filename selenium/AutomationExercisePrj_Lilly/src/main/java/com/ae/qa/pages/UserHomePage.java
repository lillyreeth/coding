package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class UserHomePage extends TestBase
{


    @FindBy(xpath = "//a[contains(text(),'Products')]")
    WebElement webElementProductsLink;
    @FindBy(xpath = "//a[contains(text(),'Cart')]")
    WebElement webElementCartLink;
    @FindBy(xpath="//a[contains(text(),'Logged in as')]")
    WebElement webElementLoggedInas;
    @FindBy(xpath="//a[contains(text(),'Delete Account')]")
    WebElement webElementDeleteAccountButton;
    @FindBy(xpath="//a[contains(text(),'Logout')]")
    WebElement webElementLogOutButton;


    public UserHomePage(){
        System.out.println("This is user home page constructor");
        PageFactory.initElements(driver, this);

    }
    public String getLoggedInUserName()
    {
        WebDriverWait wait2= new WebDriverWait(driver, 50);
        WebElement message = wait2.until(ExpectedConditions.visibilityOf(webElementLoggedInas));
        String LoggedIn=webElementLoggedInas.getText();
        System.out.println(LoggedIn);
        System.out.println("Logged in user is : " + LoggedIn);
        return LoggedIn;
    }

    public LoginPage clickLogOutButton()
    {
         webElementLogOutButton.click();
         return new LoginPage();
    }

    public AccountDeletedPage clickUserDeleteAccount()
    {
        webElementDeleteAccountButton.click();
        return new AccountDeletedPage();
    }

    public ProductsPage clickProductsLink()
    {
        webElementProductsLink.click();
        return new ProductsPage();
    }

    public CartPage clickCartLink()
    {
       webElementCartLink.click();
        return new CartPage();
    }


}
