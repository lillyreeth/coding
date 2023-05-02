package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.TestCasesPage;
import com.ae.qa.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCasesPageTest extends TestBase
{

    WelcomePage welcomePageObj;
    TestCasesPage testCasesPageObj;

    public TestCasesPageTest()
    {
        super();
    }


    @BeforeClass
    public void setUp()
    {
        initialization();
        welcomePageObj = new WelcomePage();
    }

    @Test(priority = 1)
    public void validateWelcomePageTitle()
    {
        Assert.assertEquals(welcomePageObj.getWelcomePageTitle(), prop.get("welcomePage_title"));
    }

    @Test(priority = 2)
    public void validateTestCasesLink()
    {
        testCasesPageObj= welcomePageObj.clickTestCasesLink();
        Assert.assertEquals(testCasesPageObj.getTestCasesTitle(),prop.getProperty("testcase_title"));
    }

    @Test(priority = 4)
    public void validateTestCasesHeading()
    {
        Assert.assertEquals(testCasesPageObj.getTestCasesHeading(),prop.getProperty("testcases_heading"));
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();

    }
}
