package com.qa.tests;

import com.qa.pages.Pages_takeScreenshot;
import org.testng.annotations.Test;

import java.io.IOException;


@Test
public class Test_takeScreenshot {

    public void take_screenshot() throws IOException {
        Pages_takeScreenshot.setUp_browser("chrome", "https://jqueryui.com/checkboxradio/");
        Pages_takeScreenshot.screenshot();

    }
}
