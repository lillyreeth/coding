package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PayAndConfirmPage extends TestBase {

    @FindBy(xpath = "//input[@name='name_on_card']")
    WebElement webElementNameOnCard;
    @FindBy(xpath = "//input[@name='card_number']")
    WebElement webElementCardNo;
    @FindBy(xpath = "//input[@placeholder='ex. 311']")
    WebElement webElementCVC;
    @FindBy(xpath = "//input[@placeholder='MM']")
    WebElement webElementExp;
    @FindBy(xpath = "//input[@placeholder='YYYY']")
    WebElement webElementYear;
    @FindBy(xpath = "//button[@id='submit']")
    WebElement webElementSubmitOrder;


    public PayAndConfirmPage() {
        System.out.println("This is PayAndConfirm page constructor");
        PageFactory.initElements(driver, this);
    }

    public void fillCardDetails(String name, String cardNo, String cvc, String exp, String year) {
        webElementNameOnCard.sendKeys(name);
        webElementCardNo.sendKeys(cardNo);
        webElementCVC.sendKeys(cvc);
        webElementExp.sendKeys(exp);
        webElementYear.sendKeys(year);
        webElementSubmitOrder.click();

        // WebDriverWait wait1 = new WebDriverWait(driver, 5);
        // WebElement message = wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Your order has been placed successfully!')]")));
        // WebElement message = driver.findElement(By.xpath("//*[contains(text(),'Your order has been placed successfully!')]"));
        // System.out.println("Successful message for order  : " + message.getText());
        // return message.getText();
    }


}
