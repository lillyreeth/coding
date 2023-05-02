package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.ContactUsGetInTouchPage;
import com.ae.qa.pages.ContactUsPage;
import com.ae.qa.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.*;

public class ContactUsPageTest extends TestBase
{


    WelcomePage welcomePageObj;
    ContactUsPage contactUsPageObj;
    ContactUsGetInTouchPage contactUsGetInTouchPageObj;

    public ContactUsPageTest()
    {
        super();
    }

    @BeforeClass
    public void setUp()
    {
        initialization();
        welcomePageObj = new WelcomePage();
    }

    @Test(priority = 0)
    public void validateWelcomePageTitle()
    {
        Assert.assertEquals(welcomePageObj.getWelcomePageTitle(), prop.get("welcomePage_title"));
    }

    @Test(priority = 1)
    public void validateContactUsLink()
    {
        contactUsPageObj=welcomePageObj.clickContactUsLink();
    }
    @Test(priority = 2)
    public void validateContactUsH2()
    {
        Assert.assertEquals(contactUsPageObj.getContactGetInTouchH2(),prop.getProperty("contactus_heading_expText"));

    }

      @Test(priority = 3)
      public void validateContactusForm()
     {
      contactUsGetInTouchPageObj= contactUsPageObj.fillContactUsGetInTouchForm(prop.getProperty("contactus_name"), prop.getProperty("contactus_email"), prop.getProperty("contactus_subject"), prop.getProperty("contactus_message"));

     }

     @Test(priority = 4)
     public void validateGetInTouchH2()
     {
         Assert.assertEquals(contactUsGetInTouchPageObj.getGetInTouchSuccessMessage(),prop.getProperty("contactus_GetInTouchMsg"));
     }

     @Test(priority = 5)
     public void validateHomeButton()
     {
         contactUsGetInTouchPageObj.clickGetInTouchHomeButton();
         Assert.assertEquals(welcomePageObj.getWelcomePageTitle(), prop.get("welcomePage_title"));
     }
    @AfterClass
    public void tearDown()
    {
        driver.quit();


    }

}
