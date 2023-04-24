package com.qa.pages;

import com.qa.base.DriverClass_parent;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;


public class Pages_takeScreenshot extends DriverClass_parent
{
    static public void screenshot() throws IOException {
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File sourcefile = scrShot.getScreenshotAs(OutputType.FILE);
        File destfile = new File("screenshots/screenshot1.png");
        FileUtils.copyFile(sourcefile, destfile);
    }

}
