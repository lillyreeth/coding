package com.ae.qa.testcases;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.TestCasesPage;
import com.ae.qa.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases_Test extends TestBase
{

    WelcomePage welcomeobj;
    TestCasesPage testcaseobj;

    public TestCases_Test()
    {
        super();
    }


    @BeforeMethod
    public void setup()
    {
        initialization();
        welcomeobj=new WelcomePage();
        welcomeobj.testcases_click();

    }

    @Test
    public void testcases_test()
    {

      testcaseobj=new TestCasesPage();
      testcaseobj.testcases();
      String testcase_title=testcaseobj.testcases();
      Assert.assertEquals(testcase_title,prop.getProperty("testcase_title"));
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();

    }
}
