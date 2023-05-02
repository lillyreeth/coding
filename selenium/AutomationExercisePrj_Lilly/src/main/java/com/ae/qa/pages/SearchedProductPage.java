package com.ae.qa.pages;

import com.ae.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchedProductPage extends TestBase
{

    @FindBy(xpath="//h2[@class='title text-center']")
    WebElement webElementSearchedProductH2;


   public SearchedProductPage(){
        System.out.println("This is Searched products page constructor");
        PageFactory.initElements(driver, this);
    }

    public String searchedProductH2()
    {
        return webElementSearchedProductH2.getText();
    }

    public boolean checkSearchedProductsVisibility() {
        boolean searchProductVisibility = false;
        String searchedProduct = prop.getProperty("productPage_searchProduct");
        String xpathVal = "//div[@class='productinfo text-center']//p[contains(text(),'" + searchedProduct + "')]";
        List<WebElement> webElementAllProductTitleList = driver.findElements(By.xpath(xpathVal));
        System.out.println("The size is :" + webElementAllProductTitleList.size());
        System.out.println("Products will be printed below: ");

        for (int i = 0; i < webElementAllProductTitleList.size(); i++) {
            String productName = webElementAllProductTitleList.get(i).getText();
            if (productName.contains(searchedProduct))
                searchProductVisibility = true;
            else
                searchProductVisibility = false;
        }
        return searchProductVisibility;
    }


}

