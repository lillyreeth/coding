package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.ContactUsPage;
import com.ae.qa.pages.WelcomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactUsPage_Test extends TestBase
{

    ContactUsPage contactobj;
    public ContactUsPage_Test()
    {
        super();
    }

    @BeforeMethod
    public void setup()
    {
        initialization();
        WelcomePage welcomepageobj =new WelcomePage();
        welcomepageobj.contactUs_click();
    }

        @Test(priority = 1)
        public void loginpageTitle_test() {
        contactobj=new ContactUsPage();
        String title = contactobj.getContactUsTitle();
         Assert.assertEquals(title, "Automation Exercise - Contact Us");

    }

      @Test(priority = 2)
    public void contactus_test()
    {
        contactobj=new ContactUsPage();
        contactobj.getInTouch(prop.getProperty("contactus_name"), prop.getProperty("contactus_email"), prop.getProperty("contactus_subject"), prop.getProperty("contactus_message"));
        Assert.assertEquals(contactobj.heading_verify(),prop.getProperty("contactus_heading_expText"));

        }

    @AfterMethod
    public void tearDown() throws InterruptedException
    {
        Thread.sleep(2000);
        driver.quit();


    }

}
