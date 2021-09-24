Feature: Application Login

Background:			
Given validate the browser
When Browser is triggered
Then check if browser is started



@SmokeTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with "kaustav" and password "1234"
Then Home page is populated
And Card display is "true"