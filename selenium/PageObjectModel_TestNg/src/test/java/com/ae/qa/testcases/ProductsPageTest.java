package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class ProductsPageTest extends TestBase
{
    WelcomePage welcomePageObj;

    ProductsPage productsPageObj;
    ProductDetailsPage productDetailsPageObj;
    CartPage cartPageObj;

    public ProductsPageTest()
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
    public void validateProductsDetailsNavigation()
   {
      productDetailsPageObj= productsPageObj.clickFirstProduct();
      Assert.assertEquals(productDetailsPageObj.productDetailsPageTitle(),prop.getProperty("productDetailsPage_Title"));
   }

    @Test(priority = 4)
    public void validateReviewAboutProduct()
    {
       String reviewConfirmMsg=productDetailsPageObj.fillReviewAboutProduct(prop.getProperty("login_UserName"),prop.getProperty("login_email_Valid"),prop.getProperty("productReview"));
        Assert.assertEquals(reviewConfirmMsg,prop.getProperty("productReviewConfirmMsg"));
    }

    @Test(priority = 4)
    public void validateProductNameVisibility()
   {
       Assert.assertEquals(productDetailsPageObj.getProductNameVisibility(),true);

   }
    @Test(priority = 4)
    public void validateProductPriceVisibility()
    {
        Assert.assertEquals(productDetailsPageObj.getProductPriceVisibility(),true);

    }
    @Test(priority = 4)
    public void validateProductAvailableVisibility()
    {
        Assert.assertEquals(productDetailsPageObj.getProductAvailabeVisibility(),true);

    }
    @Test(priority = 4)
    public void validateProductConditionVisibility()
    {
        Assert.assertEquals(productDetailsPageObj.getProductConditionVisibility(),true);

    }
    @Test(priority = 4)
    public void validateProductBrandVisibility()
    {
        Assert.assertEquals(productDetailsPageObj.getProductBrandVisibility(),true);

    }
    @Test(priority = 4)
    public void validateProductCategortVisibility()
    {
        Assert.assertEquals(productDetailsPageObj.getProductCategoryVisibility(),true);

    }

    @Test(priority = 4)
    public void validateProductAddToCartVisibility()
    {
        Assert.assertEquals(productDetailsPageObj.getAddToCartVisibility(),true);

    }

    @Test(priority = 3)
    public void validateAddToCartInProductPage()
    {
        cartPageObj=productsPageObj.clickAddToCartInProductPage();
        //cartPageObj.checkItemsInCart();
    }
    @Test(priority = 4)
    public void validateDeleteFromCart()
    {
        Assert.assertEquals(cartPageObj.deleteProductFromCart(),prop.get("cartEmptyMsg"));

    }


    @Test(priority = 4)
    public void validateIncreaseQuantityInProductDetailsPage()
    {
        cartPageObj=productDetailsPageObj.increaseQuantity(prop.getProperty("productQuantity"));
        Assert.assertEquals(cartPageObj.checkCartQuantity(),prop.getProperty("productQuantity"));

    }


     @AfterClass
    public void tearDown()
    {
        driver.quit();

    }

}
