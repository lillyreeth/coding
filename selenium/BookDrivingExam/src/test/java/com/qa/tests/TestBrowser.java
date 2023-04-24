package com.qa.tests;

import com.qa.base.DriverClass_parent;
import org.testng.annotations.Test;

public class TestBrowser {

    @Test
    public void testBrowser() {
        DriverClass_parent.setUp_browser("chrome","https://www.gov.uk/book-driving-test");

       // DriverClass_parent.tearDown();
    }

}
