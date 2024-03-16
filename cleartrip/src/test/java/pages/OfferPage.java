package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.OfferUi;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class OfferPage {

    WebDriverHelper help;
    OfferUi oui = new OfferUi();

    public void offersmethod(WebDriver driver, ExtentTest tests, LoggerHandler log) throws InterruptedException
    {
        help = new WebDriverHelper(driver);
        help.clickOnElement(oui.offericon);
        Thread.sleep(2000);
        help.clickOnElement(oui.partners);
    }
    
}
