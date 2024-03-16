package pages;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

import uistore.FlightUi;
import utils.*;

public class Flightpage {

    FlightUi fui = new FlightUi();
    WebDriverHelper help;
   

    public void clickroundtrip(WebDriver driver, ExtentTest test,LoggerHandler log)
    
    {
        help = new WebDriverHelper(driver);
        help.clickOnElement(fui.tripdw);
        WebElement drop = driver.findElement(fui.tripdw);
        Select value = new Select(drop);
        value.selectByIndex(1);
        log.logInfo("Selected Dropdown");
        test.pass("Selected Dropdown");
        if(driver ==null)
        System.out.println("*******************************");
        
    }

    public void clickonsourceflight(WebDriver driver, ExtentTest test, LoggerHandler log, String source) throws InterruptedException 
      
        {
        help = new WebDriverHelper(driver);
        help.clickOnElement(fui.sourceflight);
        Thread.sleep(2000);
        help.sendKeys(fui.sourceflight2, source);
        System.out.println(source);
        Thread.sleep(2000);
        WebElement ele = driver.findElement(fui.sourceflight2);
        ele.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        ele.sendKeys(Keys.ENTER);
        log.logInfo("Entered Sourcevalue "+source);
        test.pass("Entered Sourcevalue "+source);
        if(driver ==null)
        System.out.println("*******************************");
            
    }
    
    public void clickondesflight(WebDriver driver, ExtentTest test,LoggerHandler log, String destination) throws InterruptedException
    {
        help = new WebDriverHelper(driver);
        help.clickOnElement(fui.desflight);
        Thread.sleep(2000);
        help.sendKeys(fui.desflight2, destination);
        Thread.sleep(2000);
        WebElement ele1 = driver.findElement(fui.desflight2);
        Thread.sleep(2000);
        ele1.sendKeys(Keys.ARROW_DOWN);
        ele1.sendKeys(Keys.ENTER);
        log.logInfo("Entered Destvalue "+destination);
        test.pass("Entered DestValue "+destination);

    }

    public void flightsearch(WebDriver driver, ExtentTest test,LoggerHandler log) throws InterruptedException
    
    {
        help = new WebDriverHelper(driver);
        help.waitForElementToBeVisible(fui.flightsrch, 10);
        help.clickOnElement(fui.flightsrch);
        help.switchToNewWindow();
        Thread.sleep(4000);
        log.logInfo("Clicked SearchFlight");
        test.pass("Clicked SearchFlight");
    }

    public void verifyFlightPage(WebDriver driver, ExtentTest test,LoggerHandler log) throws InterruptedException, IOException
    
    {
        help = new WebDriverHelper(driver);
        help.waitForElementToBeVisible(fui.verifyflight, 10);
       String vf =  help.getText(fui.verifyflight);
       System.out.println("******" + vf + "********");
       String expectedtx = "Flight details";
       Assert.assertEquals(expectedtx, vf);
       Screenshot.getScreenShot(driver, "flightverify page");
        Thread.sleep(4000);
        log.logInfo("Clicked SearchFlight");
        test.pass("Clicked SearchFlight");
    }


    
    
}
