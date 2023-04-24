package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends TestBase
{

    @FindBy(xpath="//img[contains(text(),'Website for automation practice']")
    WebElement logo;
    @FindBy(xpath="//a[contains(text(),'Products')]")
    WebElement products;
    @FindBy(xpath="//a[contains(text(),'Signup')]")
    WebElement signupOrlogin;

    @FindBy(xpath="//a[contains(text(),'Contact us')]")
    WebElement contactUs;

    public WelcomePage()
    {
        super();
        System.out.println("This is WelcomePage constructor: loading welcome page web elements");
        PageFactory.initElements(driver,this);
    }

    public String getwelcomePageTitle()
    {

        return driver.getTitle();
    }
    public LoginPage signupLoginPage()
    {
        System.out.println("signupLoginPage method: clicking signup link");
        signupOrlogin.click();
        return new LoginPage();
    }

    public ContactUsPage contactUs_click()
    {
        contactUs.click();
        return new ContactUsPage();
    }

    public ProductsPage products_click()
    {
        contactUs.click();
        return new ProductsPage();
    }



}
