package pages;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import uistore.BusUi;
import uistore.FlightUi;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class BusPage {

    WebDriverHelper help;
    BusUi bui = new BusUi();

    public void clickbusicon(WebDriver driver, ExtentTest tests, LoggerHandler log) throws InterruptedException, IOException
    {
        help = new WebDriverHelper(driver);
        help.clickOnElement(bui.busicon);
        Thread.sleep(2000);
        log.logInfo("Clicked Bus Icon");
        tests.pass("Clicked Bus Icon");
        Screenshot.getScreenShot(driver, "BusPage");
    }

    public void inputBusvalues(WebDriver driver, ExtentTest tests, LoggerHandler log, String src, String dest) throws InterruptedException, IOException
    {   
        Thread.sleep(1000);
        help = new WebDriverHelper(driver);
        help.clickOnElement(bui.busdeparture);
        Thread.sleep(2000);
        help.sendKeys(bui.busdeparture, src);
        Thread.sleep(2000);
        System.out.println("****** "+ src+" *******");
        help.clickOnElement(bui.deppune);
        Thread.sleep(2000);
        System.out.println();
        help.clickOnElement(bui.busdest);
        Thread.sleep(2000);
        help.sendKeys(bui.busdest, dest);
        Thread.sleep(2000);
        System.out.println("****** "+ dest+" *******");
        help.clickOnElement(bui.destHyde);
        Thread.sleep(1000);
    }

    public void calendarmeth() throws InterruptedException
    {
        help.clickOnElement(bui.calendar);
        Thread.sleep(1000);
        help.clickOnElement(bui.date);
    }

    public void searchbusmeth() throws InterruptedException
    {
        help.clickOnElement(bui.searchbus);
         Thread.sleep(1000);
    }
    
    
   

}
