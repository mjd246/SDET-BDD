Feature: ClearTrip Test

Scenario Outline: Verify The Flight Details

Given I want to open the ClearTrip Homepage 

When I click on the Round Trip dropdown It should get select

And I want to enter "<location1>" in the FROM input box Any Airport or City  

And I want to enter "<location2>" in the TO input box Any Airport or City

And I Want to click on the search button

Then I will verify the text Flight Details on the redirected page

Examples:
|location1|location2|
|Chennai|Mumbai|

