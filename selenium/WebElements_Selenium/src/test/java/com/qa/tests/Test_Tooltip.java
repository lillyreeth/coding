package com.qa.tests;

import com.qa.pages.Pages_Tooltip;
import org.testng.annotations.Test;

public class Test_Tooltip {

    @Test
    public void tooltip_test() {
        Pages_Tooltip.setUp_browser("firefox","https://demo.guru99.com/test/social-icon.html");
        Pages_Tooltip.tooltip_Verify("Youtube");
        Pages_Tooltip.tearDown();
    }
}
