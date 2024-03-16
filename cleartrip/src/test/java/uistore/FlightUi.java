package uistore;

import org.openqa.selenium.By;

public class FlightUi {

    public By tripdw = By.xpath("//select[@class='trip_type']");
    public By sourceflight = By.xpath("//ul/li[2][@class='airports-codes']");
    public By sourceflight2 = By.xpath("(//input[@placeholder='Any Airport or City'])[1]");
    public By desflight = By.xpath("//ul/li[2][@class='airports-codes']");
    public By desflight2 = By.xpath("(//input[@placeholder='Any Airport or City'])[2]");
    public By flightsrch = By.xpath("//input[@id='search_flights']");
    public By verifyflight = By.xpath("//p[contains(text(),'Flight details')]");



    
}
