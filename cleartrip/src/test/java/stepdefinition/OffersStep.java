package stepdefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.OfferPage;
import utils.LoggerHandler;

public class OffersStep {
    
    WebDriver driver = Hooks.driver;
    public static ExtentTest tests = Hooks.test;
    public static LoggerHandler log = Hooks.log;
    OfferPage opg = new OfferPage();

    @Given("^I want to be in the Homepage$")
public void i_want_to_be_in_the_Homepage() throws Throwable {
   System.out.println("Opened Stepdefinition3");
}

@When("^I click on the offers icon i should be redirected to offers page$")
public void i_click_on_the_offers_icon_i_should_be_redirected_to_offers_page() throws Throwable {
   opg.offersmethod(driver, tests, log);
}

@When("^I want to click on the partners button$")
public void i_want_to_click_on_the_partners_button() throws Throwable {
    System.out.println("Opened Stepdefinition3");
}

@Then("^I will verify the partners text$")
public void i_will_verify_the_partners_text() throws Throwable {
    System.out.println("Opened Stepdefinition3");
}
}
