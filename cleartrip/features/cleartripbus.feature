Feature: Bus Scenario Check

Scenario Outline: Verify the Bus Results

Given I want to be open the ClearTrip Homepage 

When I click on the Bus icon It redirects to bus booking page

And I enter the value source value "<buslocation1>" and destination value "<buslocation2>" 

And I will select on the feb 29th date in the calendar and click on search Buses button

Then I verify the Buses found text in the redirected page

Examples:
|buslocation1|buslocation2|
|Pune|Hyderabad|


