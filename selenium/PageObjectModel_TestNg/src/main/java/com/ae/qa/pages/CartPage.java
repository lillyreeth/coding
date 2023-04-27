package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends TestBase
{

    @FindBy(xpath="//input[@id='susbscribe_email']")
    WebElement subscription_email;
    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    WebElement subscription_click;

    public CartPage()
    {
        System.out.println("This is CartPage constructor");
        PageFactory.initElements(driver, this);

    }

    public String cart_subscriptionMsg(String subs_email)
    {

        subscription_email.sendKeys(subs_email);
        subscription_click.click();
        WebDriverWait wait = new WebDriverWait(driver, 50);
        WebElement messgae = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'You have been successfully subscribed!')]")));
        System.out.println("Successful messgae is visible in subscription details as  : " + messgae.getText());
        String expmsg_subscription = messgae.getText();
        return expmsg_subscription;
    }

}
