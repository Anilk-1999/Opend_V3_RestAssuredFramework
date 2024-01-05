package api.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listener implements ITestListener 
{

	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
    public ExtentTest test;

    public void onStart(ITestContext context)
    {
    	sparkreporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/Publisher.html");
    	sparkreporter.getConf().setDocumentTitle("Anil Automation");
    	sparkreporter.getConf().setReportName("Rest Assured API Testing");
    	sparkreporter.getConf().setTheme(Theme.DARK);
    	
    	extent=new ExtentReports();
    	extent.attachReporter(sparkreporter);
    	extent.setSystemInfo("Tester name", "Anil kumar");
    	extent.setSystemInfo("Project name", "Opend_V3");
    	extent.setSystemInfo("Computer name", "Dell");
    	extent.setSystemInfo("Environment", "QA");
    	extent.setSystemInfo("OS", "linux");
    
    }
    
    public void onTestSuccess(ITestResult result)
    {
    	test=extent.createTest(result.getName());
    	test.log(Status.PASS, result.getName());
    }
    
    public void onTestFailure(ITestResult result)
    {
    	test=extent.createTest(result.getName());
    	test.log(Status.FAIL, result.getName());
    	test.log(Status.FAIL, result.getThrowable());
    	
    }
    public void onTestSkipped(ITestResult result)
    {
    	test=extent.createTest(result.getName());
    	test.log(Status.SKIP, result.getName());
    			
    }
    
    public void onFinish(ITestContext context)
    {
    	extent.flush();
    }
}
