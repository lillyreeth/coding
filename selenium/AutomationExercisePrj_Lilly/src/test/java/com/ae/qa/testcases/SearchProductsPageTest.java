package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.ProductsPage;
import com.ae.qa.pages.SearchedProductPage;
import com.ae.qa.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchProductsPageTest extends TestBase
{

    WelcomePage welcomePageObj;

    ProductsPage productsPageObj;
    SearchedProductPage searchedProductPageObj;

    public SearchProductsPageTest()
    {
        super();

    }

    @BeforeClass
    public void setUp()
    {
        initialization();
        welcomePageObj=new WelcomePage();
    }

    @Test(priority = 1)
    public void validateWelcomePageTitle()
    {
        Assert.assertEquals(welcomePageObj.getWelcomePageTitle(), prop.get("welcomePage_title"));
    }

    @Test(priority = 2)
    public void validateProductsLink()
    {

        productsPageObj= welcomePageObj.clickProductsLink();
        Assert.assertEquals(productsPageObj.getAllProductsH2(),prop.getProperty("productsPageH2"));
    }

    @Test(priority = 3)
    public void validateSearchProductField()
    {
        searchedProductPageObj=productsPageObj.fillSearchProductField(prop.getProperty("productPage_searchProduct"));
        Assert.assertEquals(searchedProductPageObj.searchedProductH2(),prop.getProperty("SearchProductPageH2"));

    }

    @Test(priority = 4)
    public void validateSearchedProductsVisibility()
    {
      Assert.assertEquals(searchedProductPageObj.checkSearchedProductsVisibility(), true);
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();

    }
}
