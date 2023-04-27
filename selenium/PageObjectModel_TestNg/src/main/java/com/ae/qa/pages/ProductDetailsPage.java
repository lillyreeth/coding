package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends TestBase
{

    @FindBy(xpath="//h2[contains(text(),'Blue Top')]")
    WebElement product_name;
    @FindBy(xpath = "//span[contains(text(),'Rs. 500')]")
    WebElement product_price;
    @FindBy(xpath = "//p[contains(text(),'In Stock')]")
    WebElement product_availability;
    @FindBy(xpath = "//p[contains(text(),'Category: Women > Tops')]")
    WebElement product_category;
    @FindBy(xpath = "//p[contains(text(),'New')]")
    WebElement product_condition;
    @FindBy(xpath = "//p[contains(text(),'polo')]")
    WebElement product_brand;
    @FindBy(xpath = "//button[@class='btn btn-default cart']")
    WebElement product_addToCart;

    public ProductDetailsPage()
    {

        System.out.println("This is product details page");
        PageFactory.initElements(driver,this);
    }

    public String productDetailsPage_getTitle()
    {
        return driver.getTitle();
    }

    public void productDetails_validateDetails()
    {

        if(product_name.isDisplayed())
        {
            System.out.println("The product name is visible");
        }
        else
        {
            System.out.println("The product name is not visible");
        }

         product_category.getText();

        if(product_availability.isDisplayed() == Boolean.parseBoolean("Instock"))
        {
            System.out.println("Product is Instock");
        }
        else {
            System.out.println("Product is outOfstock");
        }











    }












}
