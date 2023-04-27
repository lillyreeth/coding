package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends TestBase
{
    @FindBy(xpath="")
    public WebElement viewproduct;
    @FindBy(xpath="//input[@id='search_product']")
    WebElement searchProduct;
    @FindBy(xpath="//button[@id='submit_search']")
    WebElement submit_search;
    @FindBy(xpath="")
    WebElement contact_subject;
    @FindBy(xpath="")
    WebElement contact_message;
    @FindBy(xpath="")
    WebElement contact_submit;

    public ProductsPage() {
        System.out.println("This is products page constructor");
        PageFactory.initElements(driver, this);
    }

    public SearchedProductPage setSearchProduct(String productname)
    {


        searchProduct.sendKeys(productname);
        submit_search.click();
        return new SearchedProductPage();
    }






}
