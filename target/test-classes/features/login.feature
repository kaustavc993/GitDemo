Feature: Application Login

@RegTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with "kaustav" and password "1234"
Then Home page is populated
And Card display is "true"

@SmokeTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with "kenkaustav" and password "abcd"
Then Home page is populated
And Card display is "false"

#datatable concept
@MobileTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User signup with folllowing details
| jenny | abcd | jenny@gmail.com | Australia | 324353 |

Then Home page is populated
And Card display is "true"

#parameterization[scenario outline]
@RegTest
Scenario Outline: Home page default login
Given User is on Netbanking landing page
When User login into application with <Username> and password <password>
Then Home page is populated
And Card display is "false"

Examples:
| Username | password |
| user1    | pass1    |
| user2    | pass2    |
| user3    | pass3    |
| user4    | pass4    |