package com.qa.tests;

import com.qa.pages.Pages_Scroll;
import org.testng.annotations.Test;

public class Test_Scroll
{

    @Test
    public void test_scroll()
    {
        Pages_Scroll.setUp_browser("firefox","https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
        Pages_Scroll.scroll();
    }
}
