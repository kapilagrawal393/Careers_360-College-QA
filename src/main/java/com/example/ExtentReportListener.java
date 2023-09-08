package com.example;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;


public class ExtentReportListener implements ITestListener
{
	private ExtentReports extent;
    private ExtentTest test;
	
    
    public void onStart(ITestContext context) 
    {
        String extentReportFile = System.getProperty("user.dir") + "/test-output/ExtentReport.html";
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
        extent = new ExtentReports();
        
        sparkReporter.viewConfigurer().viewOrder().as(new ViewName[] {
        		ViewName.DASHBOARD,
        		ViewName.TEST,
        		ViewName.EXCEPTION,
        		ViewName.CATEGORY,
        		ViewName.DEVICE
        }).apply();
        extent.attachReporter(sparkReporter);
//      sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setReportName("Careers 360 Test");
        sparkReporter.config().setDocumentTitle("IIT_Delhi_Careers_360_Page");
        sparkReporter.config().setCss(".test{font-weight:bold;}");
//      sparkReporter.config().setTimeStampFormat("dd-mm-yy hh-mm-ss");
        sparkReporter.config().setCss(".badge-primary{background-color:#6569df}");
        sparkReporter.config().setCss(".badge-primary{background-color:#6569df}");
        extent.setSystemInfo("Testing Environment", "Live");	
        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("Java Version", System.getProperty("java.version"));
        extent.setSystemInfo("Browser", "Chrome");
        extent.setSystemInfo("Web URL", "https://www.careers360.com/university/indian-institute-of-technology-delhi");
        extent.setSystemInfo("User Name", "Kapil Agrawal");
       
//		Desktop.getDesktop().browse(new File("report.html").toURI());
		
       
    }
    
   
     
    
   

    
    public void onFinish(ITestContext context) 
    {
        extent.flush();
        
    }   
	
    @BeforeMethod
    public void onTestStart(ITestResult result)
    {
        test = extent.createTest(result.getMethod().getMethodName());
    }

    
    @AfterMethod
    public void tearDownTest(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, "Test Failed: " + result.getThrowable());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, "Test Passed");
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.log(Status.SKIP, "Test Skipped");
        }
    }
//    public void onTestSuccess(ITestResult result) 
//    {
//        test.pass("Test passed");
//    }
//    
//    
//    public void onTestFailure(ITestResult result) 
//    {
//        test.fail("Test failed");
//    }
//	
//    public void onTestSkip(ITestResult result) 
//    {
//        test.fail("Test skiped");
//    }
//	
}
