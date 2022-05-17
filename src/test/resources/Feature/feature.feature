Feature: Checking login functionality



Scenario: Successful Login with Valid Credentials
Given User is on Login Page
When User enters Credentials to LogIn
| Admin | admin123 |
Then User is on homepage
And User clicks on MyInfo
And User clicks on Contanct details
And User clicks on profile icon
And user clicks on logout button