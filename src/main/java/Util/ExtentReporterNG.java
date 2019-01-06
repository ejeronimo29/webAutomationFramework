package Util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.List;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class ExtentReporterNG implements IReporter {
    private ExtentReports extent;
    Calendar calendar;
  
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
    	System.out.println("reports" + File.separator + "IngestionAPI_"+getTime()+".html");
        extent = new ExtentReports("reports" + File.separator + "OperationPortal_"+getTime()+".html", true);
  
        for (ISuite suite : suites) {
            Map<String, ISuiteResult> result = suite.getResults();
  
            for (ISuiteResult r : result.values()) {
                ITestContext context = r.getTestContext();
  
                buildTestNodes(context.getPassedTests(), LogStatus.PASS);
                buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
                buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
            }
        }
  
        extent.flush();
        extent.close();
    }
  
    private void buildTestNodes(IResultMap tests, LogStatus status) {
        ExtentTest test;
  
        if (tests.size() > 0) {
            for (ITestResult result : tests.getAllResults()) {
                test = extent.startTest(result.getMethod().getMethodName());
  
                test.setStartedTime(getTime(result.getStartMillis()));
                test.setEndedTime(getTime(result.getEndMillis()));
  
                for (String group : result.getMethod().getGroups())
                    test.assignCategory(group);
  
                String message = "Test " + status.toString().toLowerCase() + "ed";
  
                if (result.getThrowable() != null)
                    message = result.getThrowable().getMessage();
  
                test.log(status, message);
  
                extent.endTest(test);
            }
        }
    }
  
    private Date getTime(long millis) {
        calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();        
    }
    
    public String getTime()
    {
    	calendar = Calendar.getInstance();
    	SimpleDateFormat formatter=new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
    	return formatter.format(calendar.getTime());
    	
    }
}