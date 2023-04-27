package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends TestBase
{

    @FindBy(xpath="//h2[contains(text(),'Get In Touch')]")
    public WebElement get_in_touch;
    @FindBy(xpath="//input[@placeholder='Name']")
    WebElement contact_name;
    @FindBy(xpath="//input[@placeholder='Email']")
    WebElement contact_email;
    @FindBy(xpath="//input[@placeholder='Subject']")
    WebElement contact_subject;
    @FindBy(xpath="//textarea[@id='message']")
    WebElement contact_message;
    @FindBy(xpath="//input[@name='submit']")
    WebElement contact_submit;
    @FindBy(xpath="//div[@class='status alert alert-success']")
    WebElement contact_successmsg;


    public ContactUsPage()
    {
        System.out.println("This is contact page constructor");
        PageFactory.initElements(driver,this);
    }
    public String getContactUsTitle()
    {
        return driver.getTitle();
    }

    public String heading_verify()
    {

      return get_in_touch.getText();
    }

    public void getInTouch(String name,String email,String subject,String message)
    {
        contact_name.sendKeys(name);
        contact_email.sendKeys(email);
        contact_subject.sendKeys(subject);
        contact_message.sendKeys(message);
        contact_submit.click();
        Actions act=new Actions(driver);
        driver.switchTo().alert().accept();


    }



}
