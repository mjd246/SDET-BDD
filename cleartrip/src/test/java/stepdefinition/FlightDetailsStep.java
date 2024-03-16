package stepdefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.*;
import utils.Base;
import utils.LoggerHandler;

public class FlightDetailsStep 

{
    WebDriver driver = Hooks.driver;
    ExtentTest test = Hooks.test;
    LoggerHandler log = Hooks.log;

    Flightpage fpg = new Flightpage();

    @Given("^I want to open the ClearTrip Homepage$")
    public void i_want_to_open_the_ClearTrip_Homepage() throws Throwable {
        System.out.println("Opened");
        
    }

    @When("^I click on the Round Trip dropdown It should get select$")
    public void i_click_on_the_Round_Trip_dropdown_It_should_get_select() throws Throwable {
        fpg.clickroundtrip(driver,test,log);
    }

    @When("^I want to enter \"([^\"]*)\" in the FROM input box Any Airport or City$")
    public void i_want_to_enter_in_the_FROM_input_box_Any_Airport_or_City(String arg1) throws Throwable {
        
        fpg.clickonsourceflight(driver,test,log,arg1);
    }

    @When("^I want to enter \"([^\"]*)\" in the TO input box Any Airport or City$")
    public void i_want_to_enter_in_the_TO_input_box_Any_Airport_or_City(String arg1) throws Throwable {
       
       fpg.clickondesflight(driver,test,log,arg1);
    }

    @When("^I Want to click on the search button$")
    public void i_Want_to_click_on_the_search_button() throws Throwable {
       fpg.flightsearch(driver,test,log);
    }

    @Then("^I will verify the text Flight Details on the redirected page$")
    public void i_will_verify_the_text_Flight_Details_on_the_redirected_page() throws Throwable {
       fpg.verifyFlightPage(driver, test, log);
    }

}
