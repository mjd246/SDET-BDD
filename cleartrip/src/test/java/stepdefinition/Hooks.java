package stepdefinition;

import java.net.MalformedURLException;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;

public class Hooks extends Base {

 public static WebDriver driver ;
 ExtentReports reports;
 public static ExtentTest test;
 public static LoggerHandler log = new LoggerHandler();

 @Before(order = 1)
    public void createTestReport()
    {
        reports = Reporter.generateExtentReport("ClearTrip");
  
        test = reports.createTest("Flights");
    }

    @Before(order = 2)
    public void browserup() throws MalformedURLException

    {
        driver = openBrowser();
    }


    @After(order = 2)
    public void closebrowser()
    {
        driver.quit();
    }

    @After(order = 1)
    public void reportflush()
    {
       reports.flush();
    }
    
}
