package com.qa.tests;

import com.qa.base.DriverClass_parent;
import org.testng.annotations.Test;

public class Test_DriverClass_parent {

    @Test
    public void DriverTest() {
        DriverClass_parent obj1 = new DriverClass_parent();
        obj1.setUp_browser("chrome","https://jqueryui.com/checkboxradio/");
        obj1.tearDown();
        obj1.setUp_browser("firefox","https://jqueryui.com/checkboxradio/");
        obj1.tearDown();

    }

}
