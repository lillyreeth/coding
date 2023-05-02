package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static com.ae.qa.util.TestUtil.EXPLICIT_WAIT;

public class ContactUsPage extends TestBase
{

    @FindBy(xpath="//h2[contains(text(),'Get In Touch')]")
    WebElement webElementContactGetInTouchH2;
    @FindBy(xpath="//input[@placeholder='Name']")
    WebElement webElementContactNameInput;
    @FindBy(xpath="//input[@placeholder='Email']")
    WebElement webElementContactEmailInput;
    @FindBy(xpath="//input[@placeholder='Subject']")
    WebElement webElementContactSubjectInput;
    @FindBy(xpath="//textarea[@id='message']")
    WebElement webElementContactMessageInput;
    @FindBy(xpath="//input[@name='submit']")
    WebElement webElementContactSubmitButton;


    public ContactUsPage(){
        System.out.println("This is contact page constructor");
        PageFactory.initElements(driver,this);
    }
    public String getContactUsTitle()
    {
        return driver.getTitle();
    }

    public String getContactGetInTouchH2()
    {

      return webElementContactGetInTouchH2.getText();
    }

    public ContactUsGetInTouchPage fillContactUsGetInTouchForm(String name,String email,String subject,String message)
    {
        webElementContactNameInput.sendKeys(name);
        webElementContactEmailInput.sendKeys(email);
        webElementContactSubjectInput.sendKeys(subject);
        webElementContactMessageInput.sendKeys(message);
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementContactSubmitButton)).click();
        Actions act=new Actions(driver);
        driver.switchTo().alert().accept();
        return new ContactUsGetInTouchPage();

    }

}
