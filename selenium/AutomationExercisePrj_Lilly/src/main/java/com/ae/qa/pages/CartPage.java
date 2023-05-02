package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static com.ae.qa.util.TestUtil.EXTRA_EXPLICIT_WAIT;


public class CartPage extends TestBase {


    @FindBy(xpath = "//input[@id='susbscribe_email']")
    WebElement webElementsubscriptionInput;
    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    WebElement webElementSubscriptionButton;
    @FindBy(xpath = "//h2[contains(text(),'Subscription')]")
    WebElement webElementSubscriptionHeading;
    @FindBy(xpath ="//a[contains (text(),'Proceed To Checkout')]")
    WebElement webElementCheckoutBtn;


    public CartPage(){
        System.out.println("This is CartPage constructor");
        PageFactory.initElements(driver, this);

    }

    public String getCartPageTitle() {
        return driver.getTitle();
    }

    public String doScrollDownGetSubscriptionH2() {
        //To scroll down until we find webElement (by using that WebElement)
       // EXTRA_EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementSubscriptionHeading));
        JavascriptExecutor jsScrollObj = (JavascriptExecutor) driver;
        jsScrollObj.executeScript("arguments[0].scrollIntoView();", webElementSubscriptionHeading);
        return webElementSubscriptionHeading.getText();

    }


    public String getCartSubscriptionSuccessMessage(String subs_email) {
        webElementsubscriptionInput.sendKeys(subs_email);
        webElementSubscriptionButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 50);
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'You have been successfully subscribed!')]")));
        System.out.println("Successful message is visible in subscription details as  : " + message.getText());
        return message.getText();

    }


    public void checkItemsInCart() {

        WebElement table = driver.findElement(By.xpath("//table[@class='table table-condensed']//tbody"));
        List<WebElement> all_rows = table.findElements(By.xpath("//table[@class='table table-condensed']//tr"));
        System.out.println(all_rows.size());
    }

    public String checkCartQuantity()
    {
        WebElement table = driver.findElement(By.xpath("//table[@class='table table-condensed']//tbody"));
        List<WebElement> tableRows=table.findElements(By.xpath("//table[@class='table table-condensed']//tr"));
        WebElement cartTableQuantityCell= table.findElement(By.xpath("(//table[@class='table table-condensed']//tr//td[4])[2]"));
        return cartTableQuantityCell.getText();
    }
    public CheckoutPage clickCheckout()
    {
        webElementCheckoutBtn.click();
        return new CheckoutPage();
    }

    public LoginPage clickCheckoutWithoutLogin()
    {
        webElementCheckoutBtn.click();
        WebElement registerLink=driver.findElement(By.xpath("(//div[@class='modal-dialog modal-confirm']//div//div[@class='modal-body']//p)[2]//a"));
        EXTRA_EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(registerLink));
        registerLink.click();
        return new LoginPage();
    }


    public String deleteProductFromCart()
    {
        WebElement table = driver.findElement(By.xpath("//table[@class='table table-condensed']//tbody"));
        WebElement cartTableDeleteCell= table.findElement(By.xpath("(//table[@class='table table-condensed']//tr//td[6])[2]//a"));
        cartTableDeleteCell.click();
        WebElement deleteText=driver.findElement(By.xpath("//*[contains(text(),'Cart is empty!')]"));
        return deleteText.getText();
     }



}


