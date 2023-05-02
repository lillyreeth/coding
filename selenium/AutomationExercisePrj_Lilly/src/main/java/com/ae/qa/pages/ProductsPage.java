package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.ae.qa.util.TestUtil.EXPLICIT_WAIT;
import static com.ae.qa.util.TestUtil.EXTRA_EXPLICIT_WAIT;

public class ProductsPage extends TestBase
{
    @FindBy(xpath="(//a[contains(text(),'View Product')])[1]")
    WebElement webElementViewproduct;
    @FindBy(xpath="//h2[@class='title text-center']")
    WebElement webElementAllProductsH2;
    @FindBy(xpath="//input[@id='search_product']")
    WebElement webElementSearchProductInput;
    @FindBy(xpath="//button[@id='submit_search']")
    WebElement webElementSearchProductButton;
    @FindBy(xpath="(//a[contains(text(),'Add to cart')])[1]")
    WebElement webElementAddToCartProduct1;

    @FindBy(xpath="(//a[contains(text(),'Add to cart')])[2]")
    WebElement webElementAddToCartProduct2;
    @FindBy(xpath="")
    WebElement contact_message;
    @FindBy(xpath="")
    WebElement contact_submit;

    public ProductsPage(){
        System.out.println("This is products page constructor");
        PageFactory.initElements(driver, this);
    }

    public String getAllProductsH2()
    {
        return webElementAllProductsH2.getText();
    }

    public ProductDetailsPage clickFirstProduct()
    {
        EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementViewproduct));
        webElementViewproduct.click();
        return new ProductDetailsPage();
    }

    public SearchedProductPage fillSearchProductField(String searchProduct)
    {

        webElementSearchProductInput.sendKeys(searchProduct);
        webElementSearchProductButton.click();
        return new SearchedProductPage();
    }

    public CartPage clickAddToCartInProductPage()
    {
        Actions actionAddProducts=new Actions(driver);
        JavascriptExecutor JS_SCROLLOBJ = (JavascriptExecutor) driver;
        JS_SCROLLOBJ.executeScript("arguments[0].scrollIntoView();", webElementAddToCartProduct1);
        // add first product
        actionAddProducts.moveToElement(webElementAddToCartProduct1).click().perform();

        // find and click continue button
//         WebElement webElementContinueShoppingBtn = driver.findElement(By.xpath("//button[contains(text(),'Continue Shopping')]"));
//        EXTRA_EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementContinueShoppingBtn));
//        actionAddProducts.moveToElement(webElementContinueShoppingBtn).click().perform();

       //try{ Thread.sleep(2000);}catch (Exception e){};



       WebElement viewCart=driver.findElement(By.xpath("(//div[@class='modal-dialog modal-confirm']//div//div[@class='modal-body']//p)[2]//a"));
        EXTRA_EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(viewCart));
       viewCart.click();


        // add second product
       // EXTRA_EXPLICIT_WAIT.until(ExpectedConditions.visibilityOf(webElementAddToCartProduct2));

//        System.out.println(webElementAddToCartProduct2.getText());
//        actionAddProducts.moveToElement(webElementAddToCartProduct2).click().perform();


        // find and click view cart link
      //  WebElement webElementViewCartLink =  driver.findElement(By.xpath("//u[contains(text(),'View Cart')]"));
//        WebElement webElementViewCartLink=   EXTRA_EXPLICIT_WAIT.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//u[contains(text(),'View Cart')]")));
//       actionAddProducts.moveToElement(webElementViewCartLink).click().perform();

//div[@class='modal-dialog modal-confirm']//div//div[@class='modal-body']
        return new CartPage();


    }


}
