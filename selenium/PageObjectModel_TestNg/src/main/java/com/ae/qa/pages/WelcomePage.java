package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.ae.qa.util.TestUtil.*;

public class WelcomePage extends TestBase {

    @FindBy(xpath = "//img[contains(text(),'Website for automation practice']")
    WebElement webElementLogo;
    @FindBy(xpath = "//a[contains(text(),'Products')]")
    WebElement webElementProductsLink;
    @FindBy(xpath = "//a[contains(text(),'Cart')]")
    WebElement webElementCartLink;
    @FindBy(xpath = "//a[contains(text(),'Signup')]")
    WebElement webElementSignupOrLoginLink;
    @FindBy(xpath = "//a[contains(text(),'Test Cases')]")
    WebElement webElementTestcasesLink;
    @FindBy(xpath = "//a[contains(text(),'Contact us')]")
    WebElement webElementContactUsLink;
    @FindBy(xpath = "//input[@id='susbscribe_email']")
    WebElement webElementsubscriptionInput;
    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    WebElement webElementSubscriptionButton;
    @FindBy(xpath = "//h2[contains(text(),'Subscription')]")
    WebElement webElementSubscriptionHeading;
    @FindBy(xpath = "//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")
    WebElement webElementIntroH2;
    @FindBy(xpath = "//a[@id='scrollUp']")
    WebElement webElementScrollUpArrow;

    public WelcomePage()
    {
        System.out.println("This is WelcomePage constructor: loading welcome page web elements");
        PageFactory.initElements(driver, this);
    }

    public String getWelcomePageTitle()
    {
        return driver.getTitle();
    }

    public ProductsPage clickProductsLink()
    {
        webElementProductsLink.click();
        return new ProductsPage();
    }

    public CartPage clickCartLink() {
        webElementCartLink.click();
        return new CartPage();
    }

    public LoginPage signupLoginPage() {
        System.out.println("signupLoginPage method: clicking signup link");
        webElementSignupOrLoginLink.click();
        return new LoginPage();
    }

    public TestCasesPage testcases_click() {

        webElementTestcasesLink.click();
        return new TestCasesPage();
    }

    public ContactUsPage contactUs_click() {
        webElementContactUsLink.click();
        return new ContactUsPage();
    }

    public String validateSubscription(String subs_email) throws InterruptedException {
        System.out.println("This is validate subscription method");
        JS_SCROLLOBJ.executeScript("arguments[0].scrollIntoView();",webElementsubscriptionInput);
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementsubscriptionInput)).sendKeys(subs_email);
        String expmsg_subscription = null;
        try {
            webElementSubscriptionButton.click();
            WebDriverWait wait1 = new WebDriverWait(driver, 50);
            WebElement messgae = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'You have been successfully subscribed!')]")));
            System.out.println("Successful messgae is visible in subscription details as  : " + messgae.getText());
            expmsg_subscription = messgae.getText();
             }
        catch (Throwable e)
            {
            System.out.println("Error while waiting for the notification to appear: " + e.getMessage());
            }
        return expmsg_subscription;
    }

    public String scrolldown() throws InterruptedException
    {
        //To scroll by using WebElement
        //js.executeScript("arguments[0].scrollIntoView();", subscription_text);
        //To scroll to bottom of the page
        JS_SCROLLOBJ.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementSubscriptionHeading));
        return webElementSubscriptionHeading.getText();

    }

    public String scrollup() throws InterruptedException
    {
        JS_SCROLLOBJ.executeScript("arguments[0].scrollIntoView();", webElementSubscriptionHeading);
        System.out.println("scrolled down");
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementIntroH2));
        JS_SCROLLOBJ.executeScript("arguments[0].scrollIntoView();", webElementIntroH2);
        System.out.println("scrolled up");
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementIntroH2));
        return webElementIntroH2.getText();


    }

    public String scrollup_witharrow() throws InterruptedException
    {
        JS_SCROLLOBJ.executeScript("arguments[0].scrollIntoView();", webElementSubscriptionHeading);
        System.out.println("scrolled down");
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementIntroH2));
        webElementScrollUpArrow.click();
        System.out.println("scrolled up");
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementIntroH2));
        return webElementIntroH2.getText();
    }
}
