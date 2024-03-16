package stepdefinition;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BusPage;
import utils.LoggerHandler;

public class BusStep {

    WebDriver driver = Hooks.driver;
    public static ExtentTest tests = Hooks.test;
    public static LoggerHandler log = Hooks.log;
    BusPage bpg = new BusPage();

    @Given("^I want to be open the ClearTrip Homepage$")
    public void i_want_to_be_open_the_ClearTrip_Homepage() throws Throwable {
        System.out.println("Opened Stepdefinition2");
    }
    
    @When("^I click on the Bus icon It redirects to bus booking page$")
    public void i_click_on_the_Bus_icon_It_redirects_to_bus_booking_page() throws Throwable {
        bpg.clickbusicon(driver,tests,log);
    }
    
    @When("^I enter the value source value \"([^\"]*)\" and destination value \"([^\"]*)\"$")
    public void i_enter_the_value_source_value_and_destination_value(String arg1, String arg2) throws Throwable {
        bpg.inputBusvalues(driver,tests,log,arg1,arg2);
      
    
    }
    
    @When("^I will select on the feb (\\d+)th date in the calendar and click on search Buses button$")
    public void i_will_select_on_the_feb_th_date_in_the_calendar_and_click_on_search_Buses_button(int arg1) throws Throwable {
       bpg.calendarmeth();
    }
    
    @Then("^I verify the Buses found text in the redirected page$")
    public void i_verify_the_Buses_found_text_in_the_redirected_page() throws Throwable {
       bpg.searchbusmeth();
      
    }

}
