package com.ae.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage
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








}
