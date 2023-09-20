package com.ae.qa.util;
import com.ae.qa.base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TestUtil extends TestBase
{
   public static long PAGE_LOAD_TIMEOUT=20;
   public static long IMPLICIT_WAIT=10;


  //  public static JavascriptExecutor JS_SCROLLOBJ = (JavascriptExecutor) driver;


    public static WebDriverWait EXPLICIT_WAIT = new WebDriverWait(driver, Duration.ofSeconds(5L));
    public static WebDriverWait EXTRA_EXPLICIT_WAIT = new WebDriverWait(driver, Duration.ofSeconds(10L));

    public static void takeScreenshotAtEndOfTest() throws IOException
    {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String currentDir = System.getProperty("user.dir");
        FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));

    }


}

