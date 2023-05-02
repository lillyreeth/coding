package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.ae.qa.util.TestUtil.EXPLICIT_WAIT;

public class ProductDetailsPage extends TestBase
{

    @FindBy(xpath="//div[@class='product-information']//following-sibling::h2")
    WebElement webElementProductName;
    @FindBy(xpath ="//div[@class='product-information']//span//span")
    WebElement webElementProductPrice;
    @FindBy(xpath = "//div[@class='product-information']//p[1]")
    WebElement webElementProductCategory;
    @FindBy(xpath ="//div[@class='product-information']//p[2]")
    WebElement webElementProductAvailability;

    @FindBy(xpath = "//div[@class='product-information']//p[3]")
    WebElement webElementProductCondition;
    @FindBy(xpath = "//div[@class='product-information']//p[4]")
    WebElement webElementProductBrand;
    @FindBy(xpath = "//div[@class='product-information']//span//button")
    WebElement webElementAddToCartButton;

    @FindBy(xpath = "//input[@id='quantity']")
    WebElement webElementProductQuatity;

    @FindBy(xpath="//input[@id='name']")
    WebElement webElementReviewNameInput;

    @FindBy(xpath="//input[@id='email']")
    WebElement webElementReviewEmailInput;

    @FindBy(xpath="//textarea[@id='review']")
    WebElement webElementReviewMessageInput;

    @FindBy(xpath="//button[@id='button-review']")
    WebElement webElementReviewSubmit;



    public ProductDetailsPage(){
        System.out.println("This is product details page");
        PageFactory.initElements(driver,this);
    }

    public String productDetailsPageTitle()
    {
        return driver.getTitle();
    }

    public boolean getProductNameVisibility()
    {
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementProductName));
        return webElementProductName.isDisplayed();
    }

    public boolean getProductPriceVisibility()
    {
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementProductPrice));
        return webElementProductPrice.isDisplayed();
    }
    public boolean getProductCategoryVisibility()
    {
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementProductCategory));
        return webElementProductCategory.isDisplayed();
    }
    public boolean getProductAvailabeVisibility()
    {
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementProductAvailability));
        return webElementProductAvailability.isDisplayed();
    }
    public boolean getProductConditionVisibility()
    {
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementProductCondition));
        return webElementProductCondition.isDisplayed();
    }

    public boolean getProductBrandVisibility()
    {
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementProductBrand));
        return webElementProductBrand.isDisplayed();
    }
    public boolean getAddToCartVisibility()
    {
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementAddToCartButton));
        return webElementAddToCartButton.isDisplayed();

    }

    public CartPage increaseQuantity(String Quantity)
    {
        webElementProductQuatity.clear();
        webElementProductQuatity.sendKeys(Quantity);
        webElementAddToCartButton.click();
        driver.findElement(By.xpath("//u[contains(text(),'View Cart')]")).click();
        return new CartPage();

    }

    public String  fillReviewAboutProduct(String name,String email,String message)
    {


        webElementReviewNameInput.sendKeys(name);
        webElementReviewEmailInput.sendKeys(email);
        webElementReviewMessageInput.sendKeys(message);
        webElementReviewSubmit.click();
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        WebElement reviewSuccessMessage = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Thank you')]")));
        System.out.println("Successful message after review : " + reviewSuccessMessage.getText());
        return reviewSuccessMessage.getText();
    }

}
