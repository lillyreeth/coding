package com.qa.tests;

import com.qa.pages.Pages_RightClickAndDoubleClick;
import org.testng.annotations.Test;

public class Test_RightclickAndDoubleClick
{
    @Test
   static public void test_rightClick() throws InterruptedException {
        Pages_RightClickAndDoubleClick.setUp_browser("firefox","https://demo.guru99.com/test/simple_context_menu.html");
        Pages_RightClickAndDoubleClick.rightClick();
        Pages_RightClickAndDoubleClick.doubleClick();


    }
}
