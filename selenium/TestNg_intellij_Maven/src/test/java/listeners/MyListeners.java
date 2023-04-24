package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class MyListeners implements ITestListener
{

    @Override
    public void onTestStart(ITestResult iTestResult)
    {
        System.out.println("Test started just now... hang tight... wait for results....!");

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult)
    {
        System.out.println("Test completed successfully!" + iTestResult.getTestName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult)
    {
        System.out.println("test failed..." + iTestResult.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult)
    {
        System.out.println("this is the skipping frog listener..." + iTestResult.getName()) ;
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult)
    {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
